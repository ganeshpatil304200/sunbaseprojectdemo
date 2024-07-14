package com.example.sunbaseproject.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.sunbaseproject.entity.Customer;
import com.example.sunbaseproject.repository.CustomerRepository;

//service/CustomerService.java
@Service
public class CustomerService {
 @Autowired
 private CustomerRepository customerRepository;
 
// public List<Customer> getAllCustomers(int page, int size, String sortBy, String direction) {
//     Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
//     return customerRepository.findAll(pageable).getContent();
// }
 
 public Customer getCustomerById(Long id) {
     return customerRepository.findById(id).orElseThrow();
 }
 
 public Customer createCustomer(Customer customer) {
     return customerRepository.save(customer);
 }
 
 public Customer updateCustomer(Long id, Customer customer) {
     Customer existingCustomer = getCustomerById(id);
     existingCustomer.setFirstName(customer.getFirstName());
     existingCustomer.setLastName(customer.getLastName());
     // update other fields
     return customerRepository.save(existingCustomer);
 }
 
 public void deleteCustomer(Long id) {
     customerRepository.deleteById(id);
 }
}
