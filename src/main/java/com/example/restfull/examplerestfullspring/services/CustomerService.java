package com.example.restfull.examplerestfullspring.services;

import com.example.restfull.examplerestfullspring.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCostumer(Customer customer);
}
