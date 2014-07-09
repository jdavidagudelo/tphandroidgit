package com.artica.telesalud.tph.android.lightweightmodel;

import com.artica.telesalud.tph.android.model.ConceptSpringDto;
import com.j256.ormlite.field.DatabaseField;

/**
 * Causa de una atencion de emergencias.
 */
public class CausaAtencionDto implements Comparable<CausaAtencionDto>{
    /**
     * Identificador unico de un elemento en la base de datos SQLite
     */
    @DatabaseField(id = true)
    private Integer conceptId;
    /**
     * Campo con un indice para acceso eficiente.
     */
    @DatabaseField(index = true)
    private String name;

    public static final CausaAtencionDto EMPTY_CAUSA_ATENCION = new CausaAtencionDto();
    public CausaAtencionDto() {

    }

    public CausaAtencionDto(Integer conceptId, String name) {
        this.conceptId = conceptId;
        this.name = name;
    }

    public CausaAtencionDto(ConceptSpringDto concept) {
        this.conceptId = concept.getConceptId();
        this.name = concept.getShortName();
    }

    public Integer getConceptId() {
        return conceptId;
    }

    public void setConceptId(Integer conceptId) {
        this.conceptId = conceptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        if(name != null) {
            sb.append(name);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CausaAtencionDto)) return false;

        CausaAtencionDto that = (CausaAtencionDto) o;

        if (conceptId != null ? !conceptId.equals(that.conceptId) : that.conceptId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = conceptId != null ? conceptId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(CausaAtencionDto another) {

        if(name != null && another != null && another.name != null) {
            return name.compareTo(another.name);
        }
        if(name == null)
        {
            return -1;
        }
        else if(another != null && another.name == null)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
}
