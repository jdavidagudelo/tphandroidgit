package com.artica.telesalud.tph.android.model.concept;

import java.io.Serializable;

public class ConceptShort implements Serializable {

    private Integer conceptId;
    private String shortName;
    private String description;

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
}
