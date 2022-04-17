package lk.kalana.cloud.rentservice.repository;


import lk.kalana.cloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RentRepository extends JpaRepository<Rent,Integer> {
}
