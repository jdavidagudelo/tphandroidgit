package com.artica.telesalud.tph.android.service;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;
import com.artica.telesalud.tph.android.activity.CreateEventActivity;
import com.artica.telesalud.tph.android.lightweightmodel.EventDto;
import com.artica.telesalud.tph.android.mapper.DateObjectMapper;
import com.artica.telesalud.tph.android.model.EventoSpringDto;
import com.artica.telesalud.tph.android.model.evento.Evento;
import com.j256.ormlite.dao.Dao;

import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by interoperabilidad on 21/05/14.
 */
public class CreateEventService extends SaveAsyncService<EventDto, Void, List<EventoSpringDto>, EventDto> {

    public BaseActivity getActivity() {
        return activity;
    }

    public void setActivity(BaseActivity activity) {
        this.activity = activity;
    }



    public CreateEventService(BaseActivity activity) {

        super(activity);
    }


    @Override
    protected List<EventoSpringDto> doInBackground(EventDto... param) {
        try {
            List<EventoSpringDto> eventos = new ArrayList<EventoSpringDto>();
            for(EventDto event : param) {
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getString(R.string.uri_base_rest_services));
                sb.append(activity.getString(R.string.uri_save_event));
                Resources resources = activity.getResources();
                String[] paramsKeys = resources.getStringArray(R.array.uri_save_event_params);
                String params[] = event.getParamKeys();
                Map<String, String> map = new HashMap<String, String>();
                for (int i = 0; i < params.length; i++) {
                    map.put(paramsKeys[i], params[i]);
                }
                final String url = sb.toString();
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(DateObjectMapper.getConverter());
                EventoSpringDto evento = restTemplate.postForObject(url, null, EventoSpringDto.class, map);
                if(evento != null) {
                    evento.setLocalId(event.getEventId());
                    eventos.add(evento);
                }
            }
            return eventos;
        } catch (Exception e) {
            Log.e("MainActivity", e.getMessage(), e);
        }

        return null;
    }

    @Override
    protected void onPostExecute(List<EventoSpringDto> eventos) {
        try {
            if(eventos != null) {
                for(EventoSpringDto evento : eventos) {
                    EventDto event = new EventDto(evento);
                    Dao<EventDto, Integer> eventDao = activity.getHelper().getEventDao();
                    eventDao.createOrUpdate(event);
                    eventDao.deleteById(evento.getLocalId());
                }
                hideDialog();
                activity.showSuccessMessage(activity.getString(R.string.create_event_success_text));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        hideDialog();
    }
}
