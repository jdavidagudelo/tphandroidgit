package com.artica.telesalud.tph.android.service;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;
import com.artica.telesalud.tph.android.lightweightmodel.CausaAtencionDto;
import com.artica.telesalud.tph.android.lightweightmodel.CityDto;
import com.artica.telesalud.tph.android.lightweightmodel.ListConcepts;
import com.artica.telesalud.tph.android.mapper.DateObjectMapper;
import com.artica.telesalud.tph.android.model.ConceptSpringDto;
import com.artica.telesalud.tph.android.model.concept.Concept;
import com.j256.ormlite.dao.Dao;

import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by interoperabilidad on 20/05/14.
 */
public class CausasAtencionService extends GetListAsyncService<Void, Void, ListConcepts> {

    public BaseActivity getActivity() {
        return activity;
    }

    public void setActivity(BaseActivity activity) {
        this.activity = activity;
    }
    private static final String TAG = "CAUSAS ATENCION SERVICE";


    public CausasAtencionService(BaseActivity activity) {

        super(activity, Boolean.FALSE);
    }

    @Override
    protected ListConcepts doInBackground(Void... params) {

        try {
                StringBuilder sb = new StringBuilder();
                sb.append(activity.getString(R.string.uri_base_rest_services));
                sb.append(activity.getString(R.string.uri_get_event_causes));
                final String url = sb.toString();
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(DateObjectMapper.getConverter());
                ListConcepts concepts = restTemplate.getForObject(url, ListConcepts.class);
                return concepts;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }

        return null;
    }

    @Override
    protected void onPostExecute(ListConcepts concepts) {
        try {
            Dao<CausaAtencionDto, Integer> causaAtencionDao = activity.getHelper().getCausaAtencionDao();
            List<CausaAtencionDto> list = new ArrayList<CausaAtencionDto>();
            list.add(CausaAtencionDto.EMPTY_CAUSA_ATENCION);
            if (concepts != null) {

                for (ConceptSpringDto concept : concepts) {
                    CausaAtencionDto causaAtencion = new CausaAtencionDto(concept);
                    causaAtencionDao.createOrUpdate(causaAtencion);
                    list.add(causaAtencion);
                }

            } else {
                list.addAll(causaAtencionDao.queryForAll());
            }
            ArrayAdapter<CausaAtencionDto> causaAtencionArrayAdapter = new ArrayAdapter<CausaAtencionDto>(activity,
                    android.R.layout.simple_spinner_item, list);
            causaAtencionArrayAdapter
                    .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Spinner spinnerCausaAtencion = (Spinner) activity.findViewById(R.id.spinnerCausaAtencion);
            Adapter adapter =spinnerCausaAtencion.getAdapter();
            List<CausaAtencionDto> currentList = new ArrayList<CausaAtencionDto>();
            for(int i = 0; adapter != null && i < adapter.getCount(); i++)
            {
                currentList.add((CausaAtencionDto)adapter.getItem(i));
            }
            Collections.sort(list);
            Collections.sort(currentList);
            if(!currentList.equals(list)) {
                spinnerCausaAtencion.setAdapter(causaAtencionArrayAdapter);
            }
        } catch (SQLException e) {
        }
        super.hideDialog();
    }

}
