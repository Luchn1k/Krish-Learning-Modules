package lk.kalana.cloud.rentservice.repository;

import lk.codelabs.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<Rent,Integer> {
}
