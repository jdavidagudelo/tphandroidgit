package com.artica.telesalud.tph.android.service;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;
import com.artica.telesalud.tph.android.activity.CreateEventActivity;
import com.artica.telesalud.tph.android.lightweightmodel.CityDto;
import com.artica.telesalud.tph.android.lightweightmodel.ListCities;
import com.artica.telesalud.tph.android.mapper.DateObjectMapper;
import com.artica.telesalud.tph.android.model.CitySpringDto;
import com.artica.telesalud.tph.android.model.location.City;
import com.j256.ormlite.dao.Dao;

import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by interoperabilidad on 20/05/14.
 */
public class CitiesService extends GetListAsyncService<Integer, Void, ListCities> {

    public BaseActivity getActivity() {
        return activity;
    }

    public void setActivity(BaseActivity activity) {
        this.activity = activity;
    }

    private static final String TAG = "CITIES SERVICE";


    public CitiesService(BaseActivity activity) {
        super(activity, Boolean.FALSE);
    }

    @Override
    protected ListCities doInBackground(Integer... params) {
        try {

                StringBuilder sb = new StringBuilder();
                sb.append(activity.getString(R.string.uri_base_rest_services));
                sb.append(activity.getString(R.string.uri_get_cities_by_state));
                Resources resources = activity.getResources();
                String paramsKey[] = resources.getStringArray(R.array.uri_get_cities_by_state_params);
                final String url = sb.toString();
                Map<String, String> map = new HashMap<String, String>();
                for (int i = 0; i < params.length; i++) {
                    map.put(paramsKey[i], String.valueOf(params[i]));
                }
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(DateObjectMapper.getConverter());
                ListCities cities = restTemplate.getForObject(url, ListCities.class, map);
                return cities;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }

        return null;
    }

    @Override
    protected void onPostExecute(ListCities cities) {
        try {
            Dao<CityDto, Integer> cityDao = activity.getHelper().getCityDao();
            List<CityDto> list = new ArrayList<CityDto>();
            list.add(CityDto.EMPTY_CITY);
            if (cities != null) {

                for (CitySpringDto city : cities) {
                    CityDto ciudad = new CityDto(city);
                    cityDao.createOrUpdate(ciudad);
                    list.add(ciudad);
                }

            } else {
                list.addAll(cityDao.queryForAll());
            }
            ArrayAdapter<CityDto> stateArrayAdapter = new ArrayAdapter<CityDto>(activity,
                    android.R.layout.simple_spinner_item, list);
            stateArrayAdapter
                    .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Spinner spinnerCity = (Spinner) activity.findViewById(R.id.spinnerCityEvent);
            Adapter adapter =spinnerCity.getAdapter();
            List<CityDto> currentList = new ArrayList<CityDto>();
            for(int i = 0; adapter != null && i < adapter.getCount(); i++)
            {
                currentList.add((CityDto)adapter.getItem(i));
            }
            Collections.sort(list);
            Collections.sort(currentList);
            if(!currentList.equals(list)) {
                spinnerCity.setAdapter(stateArrayAdapter);
            }
            if (activity != null && activity instanceof CreateEventActivity) {
                CreateEventActivity a = (CreateEventActivity) activity;
                Integer cityId = a.getCityId();
                if (cityId != null) {
                    int selectedIndex = 0;
                    for (int i = 0; i < spinnerCity.getAdapter().getCount(); i++) {
                        if (cityId.equals(((CityDto) spinnerCity.getAdapter().getItem(i)).getCityId())) {
                            selectedIndex = i;
                        }
                    }
                    spinnerCity.setSelection(selectedIndex);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        super.hideDialog();
    }

}
