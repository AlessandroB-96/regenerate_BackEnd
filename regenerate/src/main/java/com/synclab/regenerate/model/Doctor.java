package com.synclab.regenerate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String medCode;
    String name;
    String surname;
    String specialistic;
    Long phone;

    public Doctor() {
    }

    public Doctor(String medCode, String name, String surname, String specialistic, Long phone) {
        this.medCode = medCode;
        this.name = name;
        this.surname = surname;
        this.specialistic = specialistic;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getMedCode() {
        return medCode;
    }

    public void setMedCode(String medCode) {
        this.medCode = medCode;
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

    public String getSpecialistic() {
        return specialistic;
    }

    public void setSpecialistic(String specialistic) {
        this.specialistic = specialistic;
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
                "id=" + id +
                ", medCode='" + medCode + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialistic='" + specialistic + '\'' +
                ", phone=" + phone +
                '}';
    }
}
