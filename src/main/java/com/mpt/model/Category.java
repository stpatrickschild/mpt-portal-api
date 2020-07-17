package com.mpt.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;


    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Category(){}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Category {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + description + '\'' +
                '}';
    }
}
