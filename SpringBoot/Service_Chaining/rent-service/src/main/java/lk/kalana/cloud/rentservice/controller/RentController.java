package lk.kalana.cloud.rentservice.controller;


import lk.kalana.cloud.model.rent.Rent;
import lk.kalana.cloud.rentservice.model.Response;
import lk.kalana.cloud.rentservice.model.SimpleResponse;
import lk.kalana.cloud.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services/rents")
public class RentController {


    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) {

        if (type == null) {
            return new SimpleResponse(rentService.findById(id));
        } else {
            return rentService.findDetailResponse(id);
        }


    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }


}
