package com.erick.bkool.repository.mappers;

import com.erick.bkool.domain.Item;
import com.erick.bkool.repository.model.ItemMO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMOMapper {

    Item fromModel(ItemMO mo);

    ItemMO fromDomain(Item mo);

}
