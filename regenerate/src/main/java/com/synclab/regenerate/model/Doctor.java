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
    Long phone;

    @ManyToOne
    @JoinColumn(name = "idDepartment")
    Department idDepartment;

    @OneToMany(mappedBy = "idDoctor")
    Set<Reservation> reservations;

    public Doctor() {
    }

    public Doctor(String name, String surname, Long phone) {
        this.name = name;
        this.surname = surname;
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
                ", phone=" + phone +
                '}';
    }
}
