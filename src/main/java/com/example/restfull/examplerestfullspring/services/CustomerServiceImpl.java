package com.example.restfull.examplerestfullspring.services;

import com.example.restfull.examplerestfullspring.domain.Customer;
import com.example.restfull.examplerestfullspring.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCostumer(Customer customer) {
        return customerRepository.save(customer);
    }


}
