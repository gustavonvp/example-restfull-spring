package com.example.restfull.examplerestfullspring.repository;


import com.example.restfull.examplerestfullspring.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
