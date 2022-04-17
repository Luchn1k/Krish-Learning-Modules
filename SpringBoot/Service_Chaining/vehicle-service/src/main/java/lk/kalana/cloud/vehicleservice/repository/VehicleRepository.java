package lk.kalana.cloud.vehicleservice.repository;


import lk.kalana.cloud.model.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
