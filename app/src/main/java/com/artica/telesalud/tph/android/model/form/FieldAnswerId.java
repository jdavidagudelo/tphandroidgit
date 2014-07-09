package com.artica.telesalud.tph.android.model.form;

import com.artica.telesalud.tph.android.model.concept.Concept;

import java.io.Serializable;

public class FieldAnswerId implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Concept answer;
    private Field field;

    public Concept getAnswer() {
        return answer;
    }

    public void setAnswer(Concept answer) {
        this.answer = answer;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

}
