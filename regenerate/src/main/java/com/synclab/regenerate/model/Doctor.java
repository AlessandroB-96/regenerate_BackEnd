package com.synclab.regenerate.model;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idDoc;
    String medCode;
    String name;
    String surname;
    //1 to many with department
    @OneToMany(targetEntity = Department.class, mappedBy = "Doctor")
    String specialist;
    Long phone;

    public Doctor() {
    }

    public Doctor(String medCode, String name, String surname, String specialist, Long phone) {
        this.medCode = medCode;
        this.name = name;
        this.surname = surname;
        this.specialist = specialist;
        this.phone = phone;
    }

    public Long getIdDoc() {
        return idDoc;
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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialistic(String specialist) {
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
                ", medCode='" + medCode + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialist='" + specialist + '\'' +
                ", phone=" + phone +
                '}';
    }
}
