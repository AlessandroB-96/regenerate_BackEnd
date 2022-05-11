package com.synclab.regenerate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVisit;
    String name;
    Integer duration;
    Long idDepartment;

    public Visit() {
    }

    public Visit(String name, Integer duration, Long idDepartment) {
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

    public Long getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Long idDepartment) {
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
