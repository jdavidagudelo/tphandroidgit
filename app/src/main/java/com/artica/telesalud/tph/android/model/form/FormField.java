package com.artica.telesalud.tph.android.model.form;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class FormField implements Serializable {

    private Integer formFieldId;
    @JsonManagedReference
    private Form form;
    private Field field;
    private Integer fieldNumber;
    @JsonManagedReference
    private FormField parentFormField;
    private Boolean required;
    private Integer changedBy;
    private Date dateChanged;
    private Integer creator;
    private Date dateCreated;
    private String uuid;
    @JsonBackReference
    private Set<FormField> childrenForm = new HashSet<FormField>();

    public FormField() {
    }

    public FormField(Integer formFieldId) {
        this.formFieldId = formFieldId;
    }

    public Integer getFormFieldId() {
        return formFieldId;
    }

    public void setFormFieldId(Integer formFieldId) {
        this.formFieldId = formFieldId;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Integer getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(Integer fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public FormField getParentFormField() {
        return parentFormField;
    }

    public void setParentFormField(FormField parentFormField) {
        this.parentFormField = parentFormField;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
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

    public Set<FormField> getChildrenForm() {
        return childrenForm;
    }

    public void setChildrenForm(Set<FormField> childrenForm) {

        this.childrenForm.clear();

        for (FormField formField : childrenForm)
            this.childrenForm.add(formField);
    }


}