package com.restaurant;

import javax.persistence.*;

//@Table(name = "restaurants")
//@Access(AccessType.FIELD)
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    private Menu menu;

    private Restaurant() {
    }

    public Restaurant(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
