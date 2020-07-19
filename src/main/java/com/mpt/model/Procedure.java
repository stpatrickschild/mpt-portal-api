package com.mpt.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Procedure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float inNetworkCost;
    private float outOfNetworkCost;


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

    public float getInNetworkCost() {
        return inNetworkCost;
    }

    public void setInNetworkCost(float inNetworkCost) {
        this.inNetworkCost = inNetworkCost;
    }

    public float getOutOfNetworkCost() {
        return outOfNetworkCost;
    }

    public void setOutOfNetworkCost(float outOfNetworkCost) {
        this.outOfNetworkCost = outOfNetworkCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedure procedure = (Procedure) o;
        return id == procedure.id &&
                Float.compare(procedure.inNetworkCost, inNetworkCost) == 0 &&
                Float.compare(procedure.outOfNetworkCost, outOfNetworkCost) == 0 &&
                Objects.equals(name, procedure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, inNetworkCost, outOfNetworkCost);
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inNetworkCost=" + inNetworkCost +
                ", outOfNetworkCost=" + outOfNetworkCost +
                '}';
    }
}
