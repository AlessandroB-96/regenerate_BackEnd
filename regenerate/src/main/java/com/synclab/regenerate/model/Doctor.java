package com.synclab.regenerate.model;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idDoc;
    String name;
    String surname;
    //1 to many with department
    @OneToMany(targetEntity = Department.class, mappedBy = "Doctor")
    Long specialist;
    Long phone;

    public Doctor() {
    }

    public Doctor(String name, String surname, Long specialist, Long phone) {
        this.name = name;
        this.surname = surname;
        this.specialist = specialist;
        this.phone = phone;
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

    public Long getSpecialist() {
        return specialist;
    }

    public void setSpecialistic(Long specialist) {
        this.specialist = specialist;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + idDoc +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialist='" + specialist + '\'' +
                ", phone=" + phone +
                '}';
    }
}
