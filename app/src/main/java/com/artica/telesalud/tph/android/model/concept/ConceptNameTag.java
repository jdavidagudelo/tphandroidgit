package com.artica.telesalud.tph.android.model.concept;

import java.util.Date;

public class ConceptNameTag {

    private Integer conceptNameTagId;
    private String tag;
    private String description;
    private Integer creator;
    private Date dateCreated;
    private Boolean voided;
    private Date dateVoided;
    private Integer voidedBy;
    private String voidedReason;
    private String uuid;

    public Integer getConceptNameTagId() {
        return conceptNameTagId;
    }

    public void setConceptNameTagId(Integer conceptNameTagId) {
        this.conceptNameTagId = conceptNameTagId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }

    public Date getDateVoided() {
        return dateVoided;
    }

    public void setDateVoided(Date dateVoided) {
        this.dateVoided = dateVoided;
    }

    public Integer getVoidedBy() {
        return voidedBy;
    }

    public void setVoidedBy(Integer voidedBy) {
        this.voidedBy = voidedBy;
    }

    public String getVoidedReason() {
        return voidedReason;
    }

    public void setVoidedReason(String voidedReason) {
        this.voidedReason = voidedReason;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
