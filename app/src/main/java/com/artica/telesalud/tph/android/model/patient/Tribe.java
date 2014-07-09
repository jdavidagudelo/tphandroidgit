package com.artica.telesalud.tph.android.model.patient;

import java.io.Serializable;

public class Tribe implements Serializable {

    private Integer tribeId;
    private Boolean retired;
    private String name;


    public Integer getTribeId() {
        return tribeId;
    }

    public void setTribeId(Integer tribeId) {
        this.tribeId = tribeId;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
