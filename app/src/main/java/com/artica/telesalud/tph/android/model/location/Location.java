package com.artica.telesalud.tph.android.model.location;

import java.io.Serializable;
import java.util.Date;

public class Location implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer locationId;
    private String name;
    private String description;
    private String address1;
    private String address2;
    private City city;
    private Integer creator;
    private Date dateCreated;
    private String region;
    private Boolean retired;
    private Integer retiredBy;
    private Date dateRetired;
    private String retireReason;
    private Location parentLocation;
    private String uuid;

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress2() {
        return address2;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetiredBy(Integer retiredBy) {
        this.retiredBy = retiredBy;
    }

    public Integer getRetiredBy() {
        return retiredBy;
    }

    public void setDateRetired(Date dateRetired) {
        this.dateRetired = dateRetired;
    }

    public Date getDateRetired() {
        return dateRetired;
    }

    public void setRetireReason(String retireReason) {
        this.retireReason = retireReason;
    }

    public String getRetireReason() {
        return retireReason;
    }

    public void setParentLocation(Location parentLocation) {
        this.parentLocation = parentLocation;
    }

    public Location getParentLocation() {
        return parentLocation;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
