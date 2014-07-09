package com.artica.telesalud.tph.android.model.concept;

import java.util.Date;

public class ConceptSource {

    private Integer conceptSourceId;
    private String name;
    private String description;
    private String hl7Code;
    private Integer creator;
    private Date dateCreated;
    private Boolean retired;
    private Integer retiredBy;
    private Date dateRetired;
    private String retireReason;
    private String uuid;

    public Integer getConceptSourceId() {
        return conceptSourceId;
    }

    public void setConceptSourceId(Integer conceptSourceId) {
        this.conceptSourceId = conceptSourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHl7Code() {
        return hl7Code;
    }

    public void setHl7Code(String hl7Code) {
        this.hl7Code = hl7Code;
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
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


}
