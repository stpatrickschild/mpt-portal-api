package com.mpt.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private int zip_code;
    @OneToMany
    private List<Procedure> procedureList;

    public int getId() {
        return id;
    }

    public void listId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void listName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void listAddress(String address) {
        this.address = address;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void listZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public List<Procedure> getProcedureList() {
        return procedureList;
    }

    public void listProcedureList(List<Procedure> procedureList) {
        this.procedureList = procedureList;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zip_code=" + zip_code +
                ", procedureList=" + procedureList +
                '}';
    }
}
