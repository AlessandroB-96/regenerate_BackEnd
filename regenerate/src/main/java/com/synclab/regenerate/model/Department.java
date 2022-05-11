package com.synclab.regenerate.model;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "specialist")
    @Column(nullable = false, updatable = false)
    Long idDepartment;
    String name;

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
