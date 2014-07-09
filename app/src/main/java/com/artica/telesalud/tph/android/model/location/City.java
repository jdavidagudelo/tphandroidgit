package com.artica.telesalud.tph.android.model.location;

import java.io.Serializable;

public class City implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer cityId;
    private StateProvince stateProvince;
    private String code;
    private String name;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public StateProvince getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(StateProvince stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
