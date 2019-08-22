package com.amer.demo.dal.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cource {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Cource(String name) {
        this.name = name;
    }

    protected Cource() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

