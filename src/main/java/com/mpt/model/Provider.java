package com.mpt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private int zip_code;
    @OneToMany
    private Set<Procedure> procedureSet;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public Set<Procedure> getProcedureSet() {
        return procedureSet;
    }

    public void setProcedureSet(Set<Procedure> procedureSet) {
        this.procedureSet = procedureSet;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zip_code=" + zip_code +
                ", procedureSet=" + procedureSet +
                '}';
    }
}
