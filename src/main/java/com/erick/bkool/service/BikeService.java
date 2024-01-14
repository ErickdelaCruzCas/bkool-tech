package com.erick.bkool.service;

import com.erick.bkool.domain.Bike;
import com.erick.bkool.domain.Filter;
import com.erick.bkool.ports.in.BikeServicePort;
import com.erick.bkool.ports.out.BikeRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class BikeService implements BikeServicePort {

    private final BikeRepositoryPort bikeRepositoryPort;

    @Override
    public Bike createBike(Bike bike) {
        return bikeRepositoryPort.saveBike(bike);
    }

    @Override
    public List<Bike> getBikesByFilter(Filter filter, String orderByName) {

        return bikeRepositoryPort.getBikesFiltered(filter, orderByName);
    }
}
