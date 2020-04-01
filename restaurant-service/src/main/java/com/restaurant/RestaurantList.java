package com.restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantList {
    private List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurantList() {
        if(restaurantList == null) {
            restaurantList = new ArrayList<>();
        }
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
}
