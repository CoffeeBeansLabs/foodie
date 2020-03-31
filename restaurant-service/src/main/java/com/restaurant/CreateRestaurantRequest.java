package com.restaurant;

public class CreateRestaurantRequest {

    private String name;
    private Menu menu;

    public CreateRestaurantRequest(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    private CreateRestaurantRequest() { }
}