package com.foodie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
    @RequestMapping("/restaurant")
    public String getRestaurant(){
        return "Restaurant 1 returned";
    }
}
