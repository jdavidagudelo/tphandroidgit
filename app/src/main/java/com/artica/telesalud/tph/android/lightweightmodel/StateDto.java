package com.artica.telesalud.tph.android.lightweightmodel;

import com.artica.telesalud.tph.android.model.StateProvinceSpringDto;
import com.j256.ormlite.field.DatabaseField;

/**
 * Clase que representa la lista de departamentos
 */
public class StateDto implements Comparable<StateDto>{
    @DatabaseField(id = true)
    private Integer stateId;
    @DatabaseField(index = true)
    private String name;
    @DatabaseField(index = true, foreign = true)
    private CountryDto country;

    public static final StateDto EMPTY_STATE = new StateDto();
    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }

    public StateDto() {

    }
    public StateDto(StateProvinceSpringDto state) {
        this.stateId = state.getStateProvinceId();
        this.name = state.getName();
        this.country = new CountryDto(state.getCountry());
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
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
        if (!(o instanceof StateDto)) return false;

        StateDto stateDto = (StateDto) o;

        if (country != null ? !country.equals(stateDto.country) : stateDto.country != null)
            return false;
        if (name != null ? !name.equals(stateDto.name) : stateDto.name != null) return false;
        if (stateId != null ? !stateId.equals(stateDto.stateId) : stateDto.stateId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stateId != null ? stateId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
    @Override
        public int compareTo(StateDto another) {
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
