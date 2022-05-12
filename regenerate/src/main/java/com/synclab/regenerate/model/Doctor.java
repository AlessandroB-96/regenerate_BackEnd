package com.synclab.regenerate.model;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    @ManyToOne
    @JoinColumn(name="id_department", nullable=false)
    Long idDoc;
    String name;
    String surname;
    Long phone;
    String specialist;
    //1 to many with department


    public Doctor() {
    }

    public Doctor(String name, String surname, Long phone, String specialist) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.specialist = specialist;
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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + idDoc +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                ", specialist=" + specialist +
                '}';
    }
}
