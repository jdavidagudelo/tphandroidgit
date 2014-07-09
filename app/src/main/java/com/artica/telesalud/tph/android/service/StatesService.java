package com.artica.telesalud.tph.android.service;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;
import com.artica.telesalud.tph.android.activity.CreateEventActivity;
import com.artica.telesalud.tph.android.lightweightmodel.CountryDto;
import com.artica.telesalud.tph.android.lightweightmodel.ListStates;
import com.artica.telesalud.tph.android.lightweightmodel.StateDto;
import com.artica.telesalud.tph.android.mapper.DateObjectMapper;
import com.artica.telesalud.tph.android.model.StateProvinceSpringDto;
import com.artica.telesalud.tph.android.model.location.StateProvince;
import com.j256.ormlite.dao.Dao;

import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by interoperabilidad on 20/05/14.
 */
public class StatesService extends GetListAsyncService<Void, Void, ListStates> {


    public BaseActivity getActivity() {
        return activity;
    }

    public void setActivity(BaseActivity activity) {
        this.activity = activity;
    }



    public StatesService(BaseActivity activity) {
        super(activity, Boolean.FALSE);
    }

    @Override
    protected ListStates doInBackground(Void... params) {
        try {

                StringBuilder sb = new StringBuilder();
                sb.append(activity.getString(R.string.uri_base_rest_services));
                sb.append(activity.getString(R.string.uri_get_states));
                final String url = sb.toString();
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(DateObjectMapper.getConverter());
                ListStates states = restTemplate.getForObject(url, ListStates.class);
                return states;


        } catch (Exception e) {
            Log.e("MainActivity", e.getMessage(), e);
        }

        return null;
    }

    @Override
    protected void onPostExecute(ListStates states) {
        try {
            Dao<StateDto, Integer> stateDao = activity.getHelper().getStateDao();
            Dao<CountryDto, Integer> countryDao = activity.getHelper().getCountryDao();
            List<StateDto> list = new ArrayList<StateDto>();
            list.add(StateDto.EMPTY_STATE);
            if (states != null) {

                for (StateProvinceSpringDto stateProvince : states) {
                    StateDto state = new StateDto(stateProvince);
                    CountryDto country = new CountryDto(stateProvince.getCountry());
                    countryDao.createOrUpdate(country);
                    stateDao.createOrUpdate(state);
                    list.add(state);
                }

            } else {
                list.addAll(stateDao.queryForAll());
            }
            ArrayAdapter<StateDto> stateArrayAdapter = new ArrayAdapter<StateDto>(activity,
                    android.R.layout.simple_spinner_item, list);
            stateArrayAdapter
                    .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Spinner spinnerState = (Spinner) activity.findViewById(R.id.spinnerStateEvent);
            Adapter adapter =spinnerState.getAdapter();
            List<StateDto> currentList = new ArrayList<StateDto>();
            for(int i = 0; adapter != null && i < adapter.getCount(); i++)
            {
                currentList.add((StateDto)adapter.getItem(i));
            }
            Collections.sort(list);
            Collections.sort(currentList);
            if(!currentList.equals(list)) {
                spinnerState.setAdapter(stateArrayAdapter);
            }
            if (activity != null && activity instanceof CreateEventActivity) {
                CreateEventActivity a = (CreateEventActivity) activity;
                Integer stateId = a.getStateId();
                if (stateId != null) {
                    int selectedIndex = 0;
                    for (int i = 0; i < spinnerState.getAdapter().getCount(); i++) {
                        if (stateId.equals(((StateDto) spinnerState.getAdapter().getItem(i)).getStateId())) {
                            selectedIndex = i;
                        }
                    }
                    spinnerState.setSelection(selectedIndex);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        super.hideDialog();
    }

}