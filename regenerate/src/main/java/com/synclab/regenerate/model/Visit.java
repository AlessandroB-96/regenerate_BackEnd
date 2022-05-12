package com.synclab.regenerate.model;

import javax.persistence.*;
import java.util.Set;

//Father of Reservation
//Child of Department
@Entity
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    Long idVisit;
    String name;
    Integer duration;

    @ManyToOne
    //I have to specify the name of the column otherwise Hibernate will duplicate my name like "Id_Department_Id_Department"
    @JoinColumn(name = "idDepartment")
    Department idDepartment;

    @OneToMany
    Set<Reservation> reservations;

    public Visit() {
    }

    public Visit(String name, Integer duration, Department idDepartment) {
        this.name = name;
        this.duration = duration;
        this.idDepartment = idDepartment;
    }

    public Long getIdVisit() {
        return idVisit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Department getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Department idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", idDepartment=" + idDepartment +
                '}';
    }
}
