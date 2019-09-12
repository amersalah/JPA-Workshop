package com.amer.demo.dal.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private String rating;

    @ManyToOne
    private Cource cource;

    public Cource getCource() {
        return cource;
    }

    public void setCource(Cource cource) {
        this.cource = cource;
    }

    private String description;

    public Review() {
    }
    public Review(String description , String rating) {
        this.description=description;
        this.rating=rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", rating='" + rating + '\'' +
                ", cource=" + cource +
                ", description='" + description + '\'' +
                '}';
    }

}