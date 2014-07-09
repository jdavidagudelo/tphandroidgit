package com.artica.telesalud.tph.android.service;

import android.content.res.Resources;
import android.util.Log;
import android.widget.GridView;

import com.artica.telesalud.tph.android.R;
import com.artica.telesalud.tph.android.activity.BaseActivity;
import com.artica.telesalud.tph.android.activity.ListEventsActivity;
import com.artica.telesalud.tph.android.activity.LoginActivity;
import com.artica.telesalud.tph.android.adapter.EventArrayAdapter;
import com.artica.telesalud.tph.android.lightweightmodel.EventDto;
import com.artica.telesalud.tph.android.lightweightmodel.ListEvents;
import com.artica.telesalud.tph.android.lightweightmodel.UserDto;
import com.artica.telesalud.tph.android.lightweightmodel.UserInSession;
import com.artica.telesalud.tph.android.mapper.DateObjectMapper;
import com.artica.telesalud.tph.android.model.UserSpringDto;
import com.artica.telesalud.tph.android.model.evento.Evento;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by interoperabilidad on 28/05/14.
 */
public class LoginService extends GetListAsyncService<String, Void, UserSpringDto>  {
    public LoginService(BaseActivity activity) {
        super(activity, Boolean.TRUE);
    }

    @Override
    protected UserSpringDto doInBackground(String... params) {
        try {

            StringBuilder sb = new StringBuilder();
            sb.append(activity.getString(R.string.uri_base_rest_services));
            sb.append(activity.getString(R.string.uri_login));
            Resources resources = activity.getResources();
            String paramsKey[] = resources.getStringArray(R.array.uri_login_params);
            final String url = sb.toString();
            Map<String, String> map = new HashMap<String, String>();
            DateObjectMapper mapper = new DateObjectMapper();
            for (int i = 0; i < params.length; i++) {
                map.put(paramsKey[i], String.valueOf(params[i]));
            }
            /**RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(DateObjectMapper.getConverter());
            UserDto user = restTemplate.getForObject(url, UserDto.class, map);*/
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> requestEntity = new HttpEntity<String>(
                    UserInSession.getHeaders());

            restTemplate.getMessageConverters().add(DateObjectMapper.getConverter());
            ResponseEntity<UserSpringDto> entity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, UserSpringDto.class, map);
            return entity.getBody();
        } catch (Exception e) {
            Log.e("TAG", e.getMessage(), e);
        }
        hideDialog();
        return null;
    }

    @Override
    protected void onPostExecute(UserSpringDto user) {
        if(user != null)
        {
            UserInSession.setInstance(new UserDto(user));
            if(activity != null && activity instanceof LoginActivity)
            {
                LoginActivity loginActivity = (LoginActivity)activity;
                loginActivity.setUser(new UserDto(user));
            }
        }
        hideDialog();
    }
}
