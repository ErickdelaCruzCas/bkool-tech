package com.erick.bkool.api.mappers;

import com.erick.bkool.domain.Bike;
import com.erick.bkool.domain.dto.BikeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Mapper(componentModel = "spring")
public interface BikeMapper {


    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "manufacturer", target = "manufacturer")
    @Mapping(source = "creationDate", target = "creationDate")
    @Mapping(source = "modificationDate", target = "modificationDate")
    @Mapping(source = "items", target = "items")
    Bike toModel(BikeDTO bikeDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "manufacturer", target = "manufacturer")
    @Mapping(source = "creationDate", target = "creationDate")
    @Mapping(source = "modificationDate", target = "modificationDate")
    @Mapping(source = "items", target = "items")
    BikeDTO toDTO(Bike bike);

    default LocalDateTime map(OffsetDateTime value) {
        if (value == null) {
            return null;
        }
        return value.toLocalDateTime();
    }

    default OffsetDateTime map(LocalDateTime value) {
        if (value == null) {
            return null;
        }
        return OffsetDateTime.of(value, OffsetDateTime.now().getOffset());
    }

}
