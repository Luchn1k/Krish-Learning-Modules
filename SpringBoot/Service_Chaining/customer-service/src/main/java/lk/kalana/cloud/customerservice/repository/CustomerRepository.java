package lk.kalana.cloud.customerservice.repository;


import lk.kalana.cloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
