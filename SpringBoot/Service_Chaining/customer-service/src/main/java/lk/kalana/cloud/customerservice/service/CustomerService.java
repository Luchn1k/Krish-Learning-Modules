package lk.kalana.cloud.customerservice.service;



import lk.kalana.cloud.model.customer.Customer;

import java.util.List;


public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
