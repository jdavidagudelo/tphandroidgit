package com.artica.telesalud.tph.android.model.location;

import java.io.Serializable;

public class LocationSimple implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer locationId;
    private String name;
    private String description;
    private String address1;
    private Integer city;
    private Integer state;

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCity() {
        return city;
    }
}
