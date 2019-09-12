package com.amer.demo.dal.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;


    @OneToOne(fetch = FetchType.LAZY)
    private Passport passport;

    protected Student() {
    }

    @ManyToMany
    @JoinTable(name = "student_cource" ,
        joinColumns =@JoinColumn(name = "student_id"),
            inverseJoinColumns =@JoinColumn(name = "cource_id")
    )
    private List<Cource> cources = new ArrayList<>();

    public List<Cource> getCources() {
        return cources;
    }

    public void addCources(Cource cource) {
        this.cources.add(cource);
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passport=" + passport +
                '}';
    }
}