package com.example.restfull.examplerestfullspring.bootstrap;

import com.example.restfull.examplerestfullspring.domain.Customer;
import com.example.restfull.examplerestfullspring.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
        private final CustomerRepository customerRepository;

        public BootStrapData(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        @Override
        public void run(String... args) throws Exception {
            System.out.println("Loading Customer Data");

            Customer c1 = new Customer();
            c1.setFirstname("Michaele");
            c1.setLastname("Ahnue");
            customerRepository.save(c1);

            Customer c2 = new Customer();
            c2.setFirstname("Sam");
            c2.setLastname("Axe");
            customerRepository.save(c2);

            Customer c3 = new Customer();
            c3.setFirstname("Sam");
            c3.setLastname("Axe");
            customerRepository.save(c3);

            System.out.println("Customer Saved : " + customerRepository.count());

        }
}