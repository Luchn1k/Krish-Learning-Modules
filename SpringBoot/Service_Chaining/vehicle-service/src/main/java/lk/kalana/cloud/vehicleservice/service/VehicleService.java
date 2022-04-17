package lk.kalana.cloud.vehicleservice.service;



import lk.kalana.cloud.model.vehicle.Vehicle;

import java.util.List;


public interface VehicleService {
    Vehicle save(Vehicle customer);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
