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
    private Provider provider;
    private double inNetworkCost;
    private double outOfNetworkCost;
    private double uninsuredCost;

    public Procedure(String name, Category category, Provider provider, double inNetworkCost, double outOfNetworkCost, double uninsuredCost){
        this.name = name;
        this.category = category;
        this.provider = provider;
        this.inNetworkCost = inNetworkCost;
        this.outOfNetworkCost = outOfNetworkCost;
        this.uninsuredCost = uninsuredCost;
    }

    public Procedure(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public double getInNetworkCost() {
        return inNetworkCost;
    }

    public void setInNetworkCost(double inNetworkCost) {
        this.inNetworkCost = inNetworkCost;
    }

    public double getOutOfNetworkCost() {
        return outOfNetworkCost;
    }

    public void setOutOfNetworkCost(double outOfNetworkCost) {
        this.outOfNetworkCost = outOfNetworkCost;
    }

    public double getUninsuredCost() {
        return uninsuredCost;
    }

    public void setUninsuredCost(double uninsuredCost) {
        this.uninsuredCost = uninsuredCost;
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
