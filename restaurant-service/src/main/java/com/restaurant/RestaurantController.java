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

    @GetMapping(path="/", produces = "application/json")
    public RestaurantList getAllRestaurants()
    {
        return restaurantDAO.getAllRestaurants();
    }

//    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
//    public ResponseEntity<Object> addEmployee(@RequestBody Restaurant restaurant)
//    {
//        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
//        employee.setId(id);
//
//        employeeDao.addEmployee(employee);
//        return ResponseEntity.created(location).build();
//    }
}
