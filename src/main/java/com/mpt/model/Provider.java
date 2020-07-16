package com.mpt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    private long zip_code;

    public Provider(String name, String address, long zip_code){
        this.name = name;
        this.address = address;
        this.zip_code = zip_code;
    }

    public Provider(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getZip_code() {
        return zip_code;
    }

    public void setZip_code(long zip_code) {
        this.zip_code = zip_code;
    }




    @Override
    public String toString() {
        return "Provider {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zip_code='" + zip_code + '\'' +
                '}';
    }
}
