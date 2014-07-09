package com.artica.telesalud.tph.android.model.concept;

import java.util.Date;

public class ConceptSet {

    private Integer conceptSetId;
    private Concept concept;
    private Concept conceptSet;
    private Double sortWeight;
    private Integer creator;
    private Date dateCreated;
    private String uuid;

    public Integer getConceptSetId() {
        return conceptSetId;
    }

    public void setConceptSetId(Integer conceptSetId) {
        this.conceptSetId = conceptSetId;
    }

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    public Concept getConceptSet() {
        return conceptSet;
    }

    public void setConceptSet(Concept conceptSet) {
        this.conceptSet = conceptSet;
    }

    public Double getSortWeight() {
        return sortWeight;
    }

    public void setSortWeight(Double sortWeight) {
        this.sortWeight = sortWeight;
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
