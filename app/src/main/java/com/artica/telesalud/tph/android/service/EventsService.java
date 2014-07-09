package com.artica.telesalud.tph.android.service;

import android.content.res.Resources;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;
import com.artica.telesalud.tph.android.activity.CreateEventActivity;
import com.artica.telesalud.tph.android.activity.ListEventsActivity;
import com.artica.telesalud.tph.android.adapter.EventArrayAdapter;
import com.artica.telesalud.tph.android.lightweightmodel.CityDto;
import com.artica.telesalud.tph.android.lightweightmodel.EventDto;
import com.artica.telesalud.tph.android.lightweightmodel.ListCities;
import com.artica.telesalud.tph.android.lightweightmodel.ListEvents;
import com.artica.telesalud.tph.android.lightweightmodel.StateDto;
import com.artica.telesalud.tph.android.lightweightmodel.UserInSession;
import com.artica.telesalud.tph.android.mapper.DateObjectMapper;
import com.artica.telesalud.tph.android.model.EventoSpringDto;
import com.artica.telesalud.tph.android.model.evento.Evento;
import com.artica.telesalud.tph.android.model.location.City;
import com.j256.ormlite.dao.Dao;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by interoperabilidad on 26/05/14.
 */
public class EventsService extends GetListAsyncService<Integer, Void, ListEvents> {
    public EventsService(BaseActivity activity) {

        super(activity, Boolean.TRUE);
    }

    @Override
    protected ListEvents doInBackground(Integer... params) {
        try {

            StringBuilder sb = new StringBuilder();
            sb.append(activity.getString(R.string.uri_base_rest_services));
            sb.append(activity.getString(R.string.uri_get_events));
            Resources resources = activity.getResources();
            String paramsKey[] = resources.getStringArray(R.array.uri_get_events_params);
            final String url = sb.toString();
            Map<String, String> map = new HashMap<String, String>();
            DateObjectMapper mapper = new DateObjectMapper();

            for (int i = 0; i < params.length; i++) {
                map.put(paramsKey[i], String.valueOf(params[i]));
            }
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> requestEntity = new HttpEntity<String>(
                    UserInSession.getHeaders());
            restTemplate.getMessageConverters().add(DateObjectMapper.getConverter());
            ResponseEntity<ListEvents> entity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ListEvents.class, map);
            ListEvents events = entity.getBody();
            //ListEvents events = restTemplate.getForObject(url, ListEvents.class, map);
            return events;
        } catch (Exception e) {
            Log.e("TAG", e.getMessage(), e);
        }
        hideDialog();
        return null;
    }

    @Override
    protected void onPostExecute(ListEvents events) {
        List<EventDto> list = new ArrayList<EventDto>();
        if(events != null)
        {
            for(EventoSpringDto evento : events)
            {
                EventDto eventDto = new EventDto(evento);
                list.add(eventDto);
            }
            if(activity != null && activity instanceof ListEventsActivity && !list.isEmpty())
            {
                ListEventsActivity listEventsActivity = (ListEventsActivity)activity;
                List<EventDto> copy = new ArrayList<EventDto>();
                copy.addAll(list);
                listEventsActivity.setEvents(copy);
                GridView grid = (GridView)listEventsActivity.findViewById(R.id.listViewEvents);
                EventArrayAdapter adapter = new EventArrayAdapter(activity, list);

                grid.setAdapter(adapter);

            }
        }
        hideDialog();
    }

}
