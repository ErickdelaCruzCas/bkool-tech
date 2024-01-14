package com.erick.bkool.ports.out;

import com.erick.bkool.domain.Bike;
import com.erick.bkool.domain.Filter;

import java.util.List;

public interface BikeRepositoryPort {

    Bike saveBike(Bike bike);

    List<Bike> getBikesFiltered(Filter filter, String orderByName);

}
