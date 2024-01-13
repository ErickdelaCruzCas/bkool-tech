package com.erick.bkool.repository.mappers;

import com.erick.bkool.model.Bike;
import com.erick.bkool.repository.model.BikeMO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BikeMOMapper {


    @Mapping(source = "bikeMO", target = "Bike")
    Bike fromModel(BikeMO mo);

}
