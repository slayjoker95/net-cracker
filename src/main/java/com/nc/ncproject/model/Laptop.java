package com.nc.ncproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String model;
    private Long price;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Laptop(String model, Long price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }
    protected Laptop(){

    }
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, model='%s', price=%d, color='%s']",
                id, model, price, color);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
