package com.artica.telesalud.tph.android.model.form;

import java.util.Date;

public class FieldAnswer {

    private FieldAnswerId fieldAnswerId;
    private Integer creator;
    private Date dateCreated;
    private String uuid;

    public FieldAnswerId getFieldAnswerId() {
        return fieldAnswerId;
    }

    public void setFieldAnswerId(FieldAnswerId fieldAnswerId) {
        this.fieldAnswerId = fieldAnswerId;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
