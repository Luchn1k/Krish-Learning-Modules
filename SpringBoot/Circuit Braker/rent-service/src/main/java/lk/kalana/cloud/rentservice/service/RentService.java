package lk.kalana.cloud.rentservice.service;


import lk.kalana.cloud.model.rent.Rent;
import lk.kalana.cloud.rentservice.model.DetailResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface RentService {
    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;
}
