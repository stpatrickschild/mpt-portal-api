package com.mpt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private double inNetworkCost;
    private double outOfNetworkCost;
    private double uninsuredCost;












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

    //comeback to it and look at it
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Procedure procedure = (Procedure) o;
//        return id == procedure.id &&
//                Float.compare(procedure.inNetworkCost, inNetworkCost) == 0 &&
//                Float.compare(procedure.outOfNetworkCost, outOfNetworkCost) == 0 &&
//                Objects.equals(name, procedure.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, inNetworkCost, outOfNetworkCost);
//    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inNetworkCost=" + inNetworkCost +
                ", outOfNetworkCost=" + outOfNetworkCost +
                ", uninsuredCost=" + uninsuredCost +
                '}';
    }
}
