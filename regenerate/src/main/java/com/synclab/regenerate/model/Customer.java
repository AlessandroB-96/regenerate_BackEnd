package com.synclab.regenerate.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//Father of Reservation
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idCustomer;
    String name;
    String surname;
    Date dateOfBirth;

    @OneToMany
    Set<Reservation> reservations;

    public Customer() {
    }

    public Customer( Long idCustomer, String name, String surname, Date dateOfBirth) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getIdCustomer() {
        return idCustomer;
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

    public void setSurname(String username) {
        this.surname = username;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cF=" + idCustomer +
                ", name='" + name + '\'' +
                ", username='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
