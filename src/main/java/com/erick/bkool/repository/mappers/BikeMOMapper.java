package com.erick.bkool.repository.mappers;

import com.erick.bkool.domain.Bike;
import com.erick.bkool.repository.model.BikeMO;

import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BikeMOMapper {



    Bike fromModel(BikeMO mo);

    BikeMO fromDomain(Bike bike);


}
