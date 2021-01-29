package com.example.CustomerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public List<Customer> hello(){
        return service.getCustomers();
    }

    @PostMapping("/")
    public void hello(String hello){
        service.add(new Customer(hello));
    }

    @PutMapping("/")
    public void update(String hello){
        service.update(new Customer(hello));
    }

    @DeleteMapping("/")
    public void delete(String hello){
        service.delete(new Customer(hello));
    }



}
