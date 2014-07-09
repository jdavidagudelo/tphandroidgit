package com.artica.telesalud.tph.android.lightweightmodel;

import com.j256.ormlite.field.DatabaseField;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.codec.Base64;

import java.util.Arrays;

/**
 * Created by interoperabilidad on 5/06/14.
 */
public class UserInSession {
    private Integer userId;
    private String userName;
    private String personName;
    private String roleName;
    private Integer role;
    private UserInSession()
    {

    }
    private static final UserInSession INSTANCE = new UserInSession();
    public static void setInstance(UserDto user)
    {
        INSTANCE.setUserId(user.getUserId());
        INSTANCE.setUserName(user.getUserName());
        INSTANCE.setPersonName(user.getPersonName());
        INSTANCE.setRole(user.getRole());
        INSTANCE.setRoleName(user.getRoleName());
    }
    public static UserInSession getInstance()
    {
        return INSTANCE;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
    public static HttpHeaders getHeaders()
    {
        String auth = "Digitador" + ":" + "Digitador";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        byte[] encodedAuthorisation = Base64.encode(auth.getBytes());
        headers.add("Authorization", "Basic " + new String(encodedAuthorisation));

        return headers;
    }
}
