package com.artica.telesalud.tph.android.model.person;

public class AttributeTypeOptions {

    private Integer attributeTypeOptionsId;
    private PersonAttributeType personAttributeType;
    private String name;
    private Boolean defaultValue;

    public Integer getAttributeTypeOptionsId() {
        return attributeTypeOptionsId;
    }

    public void setAttributeTypeOptionsId(Integer attributeTypeOptionsId) {
        this.attributeTypeOptionsId = attributeTypeOptionsId;
    }

    public PersonAttributeType getPersonAttributeType() {
        return personAttributeType;
    }

    public void setPersonAttributeType(PersonAttributeType personAttributeType) {
        this.personAttributeType = personAttributeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

}
