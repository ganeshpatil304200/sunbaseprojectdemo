package com.example.sunbaseproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sunbaseproject.entity.Customer;
import com.example.sunbaseproject.service.CustomerService;

//controller/CustomerController.java
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
 @Autowired
 private CustomerService customerService;
 
// @GetMapping
// public List<Customer> getAllCustomers(@RequestParam(defaultValue = "0") int page, 
//                                       @RequestParam(defaultValue = "10") int size, 
//                                       @RequestParam(defaultValue = "id") String sortBy, 
//                                       @RequestParam(defaultValue = "asc") String direction) {
//     return customerService.getAllCustomers(page, size, sortBy, direction);
// }
 
 @GetMapping("/{id}")
 public Customer getCustomerById(@PathVariable Long id) {
     return customerService.getCustomerById(id);
 }
 
 @PostMapping
 public Customer createCustomer(@RequestBody Customer customer) {
     return customerService.createCustomer(customer);
 }
 
 @PutMapping("/{id}")
 public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
     return customerService.updateCustomer(id, customer);
 }
 
 @DeleteMapping("/{id}")
 public void deleteCustomer(@PathVariable Long id) {
     customerService.deleteCustomer(id);
 }
}
