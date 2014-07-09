package com.artica.telesalud.tph.android.model.patient;

import java.io.Serializable;

public class MedicoTratante implements Serializable {

    private Integer personId;
    private String completeName;
    private Integer roleId;

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleId() {
        return roleId;
    }

}
