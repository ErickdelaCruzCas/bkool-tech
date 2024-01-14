package com.erick.bkool.ports.in;

import com.erick.bkool.domain.Bike;
import com.erick.bkool.domain.Filter;

import java.util.List;

public interface BikeServicePort {
    Bike createBike(Bike toModel);

    List<Bike> getBikesByFilter(Filter filter, String orderByName);
}
