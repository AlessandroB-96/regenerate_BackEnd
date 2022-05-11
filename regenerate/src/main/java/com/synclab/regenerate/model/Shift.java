package com.synclab.regenerate.model;

import javax.persistence.*;

@Entity
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idShift;
    Long idDoc;
    Integer schedule;

    public Shift() {
    }

    public Shift(Long idDoc, Integer schedule) {
        this.idDoc = idDoc;
        this.schedule = schedule;
    }

    public Long getIdShift() {
        return idShift;
    }

    public Long getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Long idDoc) {
        this.idDoc = idDoc;
    }

    public Integer getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Shift{" +
                ", idDoc=" + idDoc +
                ", schedule=" + schedule +
                '}';
    }
}
