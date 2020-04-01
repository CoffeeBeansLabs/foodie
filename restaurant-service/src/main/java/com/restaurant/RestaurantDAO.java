package com.restaurant;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantDAO {

    private static RestaurantList restaurantList = new RestaurantList();
    private static Menu menu = new Menu();

    public RestaurantList getAllRestaurants()
    {
        return restaurantList;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantList.getRestaurantList().add(restaurant);
    }

    static {
        menu.getMenuItems().add(new MenuItem(1, "Pancake", 50.00));
        menu.getMenuItems().add(new MenuItem(2, "Waffle", 60.00));
        menu.getMenuItems().add(new MenuItem(3, "Chocolate", 70.00));
        menu.getMenuItems().add(new MenuItem(4, "Ice Cream", 80.00));
        menu.getMenuItems().add(new MenuItem(5, "Kheer", 90.00));
        restaurantList.getRestaurantList().add(new Restaurant("Delicious", menu));
    }
}
