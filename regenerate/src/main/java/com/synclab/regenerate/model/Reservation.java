package com.synclab.regenerate.model;

import javax.persistence.*;
import java.util.Date;

//Child of Doctor
//Child of Visit
//Child of Customer
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idReservation;
    String hour;
    @Column(name ="date", columnDefinition = "DATE")
    java.sql.Date date;

    @ManyToOne
    @JoinColumn(name = "idDoctor")
    Doctor idDoctor;

    @ManyToOne
    @JoinColumn(name = "idVisit")
    Visit idVisit;

    @ManyToOne
    @JoinColumn(name = "idCustomer")
    Customer idCustomer;

    public Reservation() {
    }

    public Reservation( java.sql.Date date, String hour, Doctor idDoctor, Visit idVisit ) {
        this.hour = hour;
        this.date = date;
        this.idDoctor = idDoctor;
        this.idVisit = idVisit;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }


    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public Doctor getIdDoctor() {
        return idDoctor;
    }

    public Visit getIdVisit() {
        return idVisit;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                ", idVisit=" + idVisit +
                ", hour=" + hour +
                ", date=" + date +
                '}';
    }
}
