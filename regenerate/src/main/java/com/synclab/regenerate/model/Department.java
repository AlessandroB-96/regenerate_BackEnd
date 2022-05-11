package com.synclab.regenerate.model;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "specialist")
    Long id;
    String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
