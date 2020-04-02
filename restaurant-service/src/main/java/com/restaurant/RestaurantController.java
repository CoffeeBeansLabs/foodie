package com.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantDAO restaurantDAO;

    @GetMapping
    public RestaurantList getAllRestaurants()
    {
        return restaurantDAO.getAllRestaurants();
    }

    @PostMapping
    public RestaurantList createRestaurant(@RequestBody Restaurant restaurant)
    {
//        Integer id = restaurantDAO.getAllEmployees().getEmployeeList().size() + 1;
//        restaurant.setId(id);

        restaurantDAO.addRestaurant(restaurant);
        return restaurantDAO.getAllRestaurants();
    }
}
