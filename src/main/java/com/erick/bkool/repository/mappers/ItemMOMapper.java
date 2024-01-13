package com.erick.bkool.repository.mappers;

import com.erick.bkool.model.Bike;
import com.erick.bkool.model.Item;
import com.erick.bkool.repository.model.BikeMO;
import com.erick.bkool.repository.model.ItemMO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMOMapper {


    @Mapping(source = "itemMO", target = "item")
    Item fromModel(ItemMO mo);

}
