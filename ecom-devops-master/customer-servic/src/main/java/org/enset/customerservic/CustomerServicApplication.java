package org.enset.customerservic;

import org.enset.customerservic.entities.Customer;
import org.enset.customerservic.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServicApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServicApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().firstname("yassin").lastName("yassin").email("yassin@gmail.com").build());
            customerRepository.save(Customer.builder().firstname("imane").lastName("imane").email("imane@gmail.com").build());
            customerRepository.save(Customer.builder().firstname("younes").lastName("younes").email("younes@gmail.com").build());
            customerRepository.save(Customer.builder().firstname("mohamed").lastName("mohamed").email("mohamed@gmail.com").build());

        };
    }

}
