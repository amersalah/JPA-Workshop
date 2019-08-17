package com.amer.data.dal.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/*
* Schema Update is One of he Features of Hibernate is trigered by Spring boot used to create The tables annotated by @Entity.
*/

@Entity
@NamedQuery(name = "find-all-persons" , query = "select p from Person p")
public class Person {

    @Id
    @GeneratedValue //in background it defines Sequence in DB to generate Numbers for ID
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="birth_date")
    private Timestamp birth_date;

    public Person(int id, String name, String location, Timestamp birth_date) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birth_date = birth_date;
    }

    public Person(String name, String location, Timestamp birth_date) {
        super();
        this.name = name;
        this.location = location;
        this.birth_date = birth_date;
    }
    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Timestamp birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }
}
