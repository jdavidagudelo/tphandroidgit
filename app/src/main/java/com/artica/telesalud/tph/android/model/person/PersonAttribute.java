package com.artica.telesalud.tph.android.model.person;

import java.io.Serializable;
import java.util.Date;

public class PersonAttribute implements Serializable {

    private Integer personAttributeId;
    private Person person;
    private String value;
    private PersonAttributeType personAttributeType;
    private Integer creator;
    private Date dateCreated;
    private Integer changedBy;
    private Date dateChanged;
    private Boolean voided;
    private Integer voidedBy;
    private Date dateVoided;
    private String voidReason;
    private String Uuid;


    public Integer getPersonAttributeId() {
        return personAttributeId;
    }

    public void setPersonAttributeId(Integer personAttributeId) {
        this.personAttributeId = personAttributeId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PersonAttributeType getPersonAttributeType() {
        return personAttributeType;
    }

    public void setPersonAttributeType(PersonAttributeType personAttributeType) {
        this.personAttributeType = personAttributeType;
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

    public Integer getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }

    public Integer getVoidedBy() {
        return voidedBy;
    }

    public void setVoidedBy(Integer voidedBy) {
        this.voidedBy = voidedBy;
    }

    public Date getDateVoided() {
        return dateVoided;
    }

    public void setDateVoided(Date dateVoided) {
        this.dateVoided = dateVoided;
    }

    public String getVoidReason() {
        return voidReason;
    }

    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }

}
