package com.restaurant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

//@Embeddable
//@Access(AccessType.FIELD)
public class MenuItem {

    private int id;
    private String name;
    private Double price;

    private MenuItem() {};

    public MenuItem(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
