package com.kalana.rent.profileservice.service;

import com.kalana.rentacar.model.Customer;

import java.util.List;


public interface CustomerService {
    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
