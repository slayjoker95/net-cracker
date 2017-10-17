package com.nc.ncproject.model;

public class Laptop {
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

    public Laptop(Long id, String model, Long price, String color) {

        this.id = id;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
