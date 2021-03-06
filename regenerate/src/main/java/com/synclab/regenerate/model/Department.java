package com.synclab.regenerate.model;

import javax.persistence.*;
import java.util.Set;

//Father of Visit
//Father of Doctor
@Entity
public class Department {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idDepartment;
    String name;

    @OneToMany
    Set<Visit> visits;

    @OneToMany
    Set<Doctor> doctors;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Long getidDepartment() {
        return idDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
