package com.artica.telesalud.tph.android.lightweightmodel;

import com.artica.telesalud.tph.android.model.CitySpringDto;
import com.j256.ormlite.field.DatabaseField;

/**
 * Created by interoperabilidad on 20/05/14.
 */
public class CityDto implements Comparable<CityDto>{
    @DatabaseField(id = true)
    private Integer cityId;
    @DatabaseField(index = true)
    private String name;
    @DatabaseField(index = true, foreign = true)
    private StateDto state;
    public static final CityDto EMPTY_CITY = new CityDto();
    public CityDto(CitySpringDto city) {
        this.cityId = city.getCityId();
        this.name = city.getName();
        this.state = new StateDto(city.getStateProvince());
    }
    public StateDto getState() {
        return state;
    }

    public void setState(StateDto state) {
        this.state = state;
    }

    public CityDto() {

    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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
        if (!(o instanceof CityDto)) return false;

        CityDto cityDto = (CityDto) o;

        if (cityId != null ? !cityId.equals(cityDto.cityId) : cityDto.cityId != null) return false;
        if (name != null ? !name.equals(cityDto.name) : cityDto.name != null) return false;
        if (state != null ? !state.equals(cityDto.state) : cityDto.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId != null ? cityId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(CityDto another) {

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
