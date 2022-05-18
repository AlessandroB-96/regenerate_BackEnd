package com.synclab.regenerate.model;

import javax.persistence.*;
import java.util.Set;

//Father of Reservation
//Child of Department
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    Long idDoc;
    String name;
    String surname;
    String imageUrl;
    Long phone;
    Boolean amOrPm;

    @ManyToOne
    @JoinColumn(name = "idDepartment")
    Department idDepartment;

    @OneToMany
    Set<Reservation> reservations;

    public Doctor() {
    }

    public Doctor(String name, String surname, Long phone, Boolean amOrPm, String imageUrl ) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.amOrPm = amOrPm;
        this.imageUrl = imageUrl ;
    }


    public Long getIdDoc() {
        return idDoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Boolean getAmOrPm() {
        return amOrPm;
    }

    public void setAmOrPm(Boolean amOrPm) {
        this.amOrPm = amOrPm;
    }

    public String getImageUrl() { return imageUrl ; }

    public void setImageUrl(String imageUrl ) { this.imageUrl = imageUrl; }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + idDoc +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", imageUrl=' " + imageUrl + '\'' +
                ", phone=" + phone +
                '}';
    }
}
