package com.mpt.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProcedureCost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int provider_id;
    private int category_id;
    private int procedure_id;
    private String network;
    private double cost;

    public ProcedureCost(int provider, int procedure, String network, double cost){
        this.provider_id = provider;
        this.procedure_id = procedure;
        this.network = network;
        this.cost = cost;
    }

    public ProcedureCost(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }

    public int getProcedure_id() {
        return procedure_id;
    }

    public void setProcedure_id(int procedure_id) {
        this.id = procedure_id;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String id) {
        this.network = network;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double id) { this.cost = cost; }
}

//
//public class ProcedureCost {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//    private Provider provider;
//    private Procedure procedure;
//    private String network;
//    private double cost;
//
//    public ProcedureCost(Provider provider, Procedure procedure, String network, double cost){
//        this.provider = provider;
//        this.procedure = procedure;
//        this.network = network;
//        this.cost = cost;
//    }
//
//    public ProcedureCost(){}
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Provider getProvider() {
//        return provider;
//    }
//
//    public void setProvider(Provider provider) {
//        this.provider = provider;
//    }
//
//    public Procedure getProcedure() {
//        return procedure;
//    }
//
//    public void setProcedure(int id) {
//        this.procedure = procedure;
//    }
//
//    public String getNetwork() {
//        return network;
//    }
//
//    public void setNetwork(String id) {
//        this.network = network;
//    }
//
//    public double getCost() {
//        return cost;
//    }
//
//    public void setCost(double id) { this.cost = cost; }
//}
