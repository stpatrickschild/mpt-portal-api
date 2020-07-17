package com.mpt.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Category category;

    public Procedure(String name, Category category){
        this.name = name;
        this.category = category;
    }

    public Procedure(){}

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

    public Category getCategory() {
        return category;
    }

    public void setDescription(String name) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Procedure {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category.toString() + '\'' +
                '}';
    }
}
