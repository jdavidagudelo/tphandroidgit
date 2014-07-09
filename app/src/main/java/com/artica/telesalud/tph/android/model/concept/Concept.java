package com.artica.telesalud.tph.android.model.concept;

import java.io.Serializable;
import java.util.Date;

public class Concept implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer conceptId;
    private String shortName;
    private String description;
    private String formText;
    private ConceptDataType conceptDataType;
    private ConceptClass conceptClass;
    private Boolean isSet;
    private Integer creator;
    private Date dateCreated;
    private Integer defaultCharge;
    private String version;
    private Integer changedBy;
    private Date dateChanged;
    private Boolean retired;
    private Integer retiredBy;
    private Date dateRetired;
    private String retireReason;
    private String Uuid;

    public Concept() {
    }

    public Integer getConceptId() {
        return conceptId;
    }

    public void setConceptId(Integer conceptId) {
        this.conceptId = conceptId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormText() {
        return formText;
    }

    public void setFormText(String formText) {
        this.formText = formText;
    }

    public ConceptDataType getConceptDataType() {
        return conceptDataType;
    }

    public void setConceptDataType(ConceptDataType conceptDataType) {
        this.conceptDataType = conceptDataType;
    }

    public ConceptClass getConceptClass() {
        return conceptClass;
    }

    public void setConceptClass(ConceptClass conceptClass) {
        this.conceptClass = conceptClass;
    }

    public Boolean getIsSet() {
        return isSet;
    }

    public void setIsSet(Boolean isSet) {
        this.isSet = isSet;
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

    public Integer getDefaultCharge() {
        return defaultCharge;
    }

    public void setDefaultCharge(Integer defaultCharge) {
        this.defaultCharge = defaultCharge;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

    public Integer getRetiredBy() {
        return retiredBy;
    }

    public void setRetiredBy(Integer retiredBy) {
        this.retiredBy = retiredBy;
    }

    public Date getDateRetired() {
        return dateRetired;
    }

    public void setDateRetired(Date dateRetired) {
        this.dateRetired = dateRetired;
    }

    public String getRetireReason() {
        return retireReason;
    }

    public void setRetireReason(String retireReason) {
        this.retireReason = retireReason;
    }

    public String getUuid() {
        return Uuid;
    }

    public void setUuid(String uuid) {
        Uuid = uuid;
    }

}
