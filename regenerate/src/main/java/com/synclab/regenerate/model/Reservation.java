package com.synclab.regenerate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;
    Long cF;
    Long idDoc;
    Long idDepartment;
    Long idVisit;
    Date hour;
    Date date;

    public Reservation() {
    }

    public Reservation(Long cF, Long idDoc, Long idDepartment, Long idVisit, Date hour, Date date) {
        this.cF = cF;
        this.idDoc = idDoc;
        this.idDepartment = idDepartment;
        this.idVisit = idVisit;
        this.hour = hour;
        this.date = date;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Long getcF() {
        return cF;
    }

    public void setcF(Long cF) {
        this.cF = cF;
    }

    public Long getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Long idDoc) {
        this.idDoc = idDoc;
    }

    public Long getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Long idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Long getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(Long idVisit) {
        this.idVisit = idVisit;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "cF=" + cF +
                ", idDoc=" + idDoc +
                ", idDepartment=" + idDepartment +
                ", idVisit=" + idVisit +
                ", hour=" + hour +
                ", date=" + date +
                '}';
    }
}
