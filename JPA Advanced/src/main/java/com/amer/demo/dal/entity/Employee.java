package com.amer.demo.dal.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Inheritance Types
//1- Single Table ->>  all in One Table (height concern of Performance )
//2- Table Per Class(sub Classes)
//3- Joined (abstract is a Table and each sub class in another Table) (height concern of Data Integrity)
//4-MappedSuperClass Employee witll be Super Class not entity
//@DiscriminatorColumn(name = "employeeType") used in Single Table to define types of Classes inherits the Employee

@MappedSuperclass
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    protected Employee() {
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

