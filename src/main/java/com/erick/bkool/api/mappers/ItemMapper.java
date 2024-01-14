package com.erick.bkool.api.mappers;

import com.erick.bkool.domain.Bike;
import com.erick.bkool.domain.Item;
import com.erick.bkool.domain.dto.BikeDTO;
import com.erick.bkool.domain.dto.ItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item toModel(ItemDTO itemDTO);

    ItemDTO toDTO(Item item);

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
