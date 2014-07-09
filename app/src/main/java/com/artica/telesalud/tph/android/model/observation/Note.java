package com.artica.telesalud.tph.android.model.observation;

import com.artica.telesalud.tph.android.model.encounter.Encounter;
import com.artica.telesalud.tph.android.model.patient.Patient;

import java.util.Date;

public class Note {

    private Integer noteId;
    private String noteType;
    private Patient patient;
    private Obs obs;
    private Encounter encounter;
    private String text;
    private Integer priority;
    private Note parent;
    private Integer creator;
    private Date dateCreated;
    private Integer changedBy;
    private Date dateChanged;
    private String uuid;

    public Integer getNoteId() {

        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Obs getObs() {
        return obs;
    }

    public void setObs(Obs obs) {
        this.obs = obs;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Note getParent() {
        return parent;
    }

    public void setParent(Note parent) {
        this.parent = parent;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
