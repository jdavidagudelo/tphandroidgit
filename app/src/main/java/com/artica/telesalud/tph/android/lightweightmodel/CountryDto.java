package com.artica.telesalud.tph.android.lightweightmodel;

import com.artica.telesalud.tph.android.model.CountrySpringDto;
import com.j256.ormlite.field.DatabaseField;

/**
 * Created by interoperabilidad on 20/05/14.
 */
public class CountryDto implements Comparable<CountryDto>{

    @DatabaseField(id = true)
    private Integer countryId;
    @DatabaseField(index = true)
    private String name;

    public CountryDto() {

    }

    public static final CountryDto EMPTY_COUNTRY = new CountryDto();
    public CountryDto(CountrySpringDto country) {
        this.countryId = country.getCountryId();
        this.name = country.getName();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryDto)) return false;

        CountryDto that = (CountryDto) o;

        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId != null ? countryId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    @Override
    public int compareTo(CountryDto another) {

        if(name != null && another != null && another.name != null) {
            return name.compareTo(another.name);
        }  if(name == null)
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
