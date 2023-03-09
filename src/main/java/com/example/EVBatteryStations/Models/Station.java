package com.example.EVBatteryStations.Models;

import javax.persistence.*;

@Entity
@Table(name="EVStation")
public class Station {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;

    private String image;

    private int pricing;

    private String address;

    //Mapping


    //Constructors

    public Station() {

    }

    public Station(int id, String name, String image,int pricing, String address) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.address = address;
        this.pricing = pricing;
    }
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPricing() {
        return pricing;
    }

    public void setPricing(int pricing) {
        this.pricing = pricing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
