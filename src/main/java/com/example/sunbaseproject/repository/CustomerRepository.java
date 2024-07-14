package com.example.sunbaseproject.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sunbaseproject.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
    Page<Customer> findAll(Pageable pageable);
}
