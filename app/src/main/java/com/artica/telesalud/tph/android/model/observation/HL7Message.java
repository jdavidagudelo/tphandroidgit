package com.artica.telesalud.tph.model.android.observation;

import com.artica.telesalud.tph.android.model.encounter.Encounter;

import java.util.Date;

public class HL7Message {

    public static String STATE_SEND = "ENVIADO";
    public static String STATE_ERROR = "ERROR";
    public static String STATE_CONFIRMADO = "CONFIRMADO";

    private Integer hl7MessageId;
    private String typeMsg;
    private String message;
    private String ackMsg;
    private Encounter encounter;
    private Date dateCreated;
    private Date dateChanged;
    private String status;
    private String uuid;

    public void setHl7MessageId(Integer hl7MessageId) {
        this.hl7MessageId = hl7MessageId;
    }

    public Integer getHl7MessageId() {
        return hl7MessageId;
    }

    public void setTypeMsg(String typeMsg) {
        this.typeMsg = typeMsg;
    }

    public String getTypeMsg() {
        return typeMsg;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setAckMsg(String ackMsg) {
        this.ackMsg = ackMsg;
    }

    public String getAckMsg() {
        return ackMsg;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }


}
