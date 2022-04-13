package com.kalana.rent.profileservice.repository;

import com.kalana.rentacar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
