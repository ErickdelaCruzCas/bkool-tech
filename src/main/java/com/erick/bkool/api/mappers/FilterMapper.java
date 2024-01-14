package com.erick.bkool.api.mappers;

import com.erick.bkool.domain.Filter;
import com.erick.bkool.domain.dto.FilterDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface FilterMapper {

    Filter toModel (FilterDTO filterDTO);

}
