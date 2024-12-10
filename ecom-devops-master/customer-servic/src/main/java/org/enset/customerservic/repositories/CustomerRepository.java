package org.enset.customerservic.repositories;

import org.enset.customerservic.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
