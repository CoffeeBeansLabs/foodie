package com.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @RequestMapping("/customer")
    public String getCustomer(){
        return "Customer 1 returned";
    }
}
