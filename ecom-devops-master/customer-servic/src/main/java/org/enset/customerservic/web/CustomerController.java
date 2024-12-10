package org.enset.customerservic.web;


import org.enset.customerservic.entities.Customer;
import org.enset.customerservic.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;


    @GetMapping("/api/customers/{id}")
    Customer getCustomerById(@PathVariable long id){
        return customerRepository.findById(id).get();
    }

    @GetMapping("/api/customers")
    List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

}
