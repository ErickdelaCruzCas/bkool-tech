package com.erick.bkool.repository.adapters;

import com.erick.bkool.domain.Bike;
import com.erick.bkool.domain.Filter;
import com.erick.bkool.ports.out.BikeRepositoryPort;
import com.erick.bkool.repository.BikeMOJpaRepository;
import com.erick.bkool.repository.mappers.BikeMOMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class BikeRepositoryAdapter implements BikeRepositoryPort {

    public static final String PROPERTY_TO_SORT = "name";
    public static final String ASC = "ASC";
    private final BikeMOJpaRepository bikeMOJpaRepository;

    private final BikeMOMapper bikeMOMapper;


    @Override
    public Bike saveBike(Bike bike) {
        var bikeToSave = bikeMOMapper.fromDomain(bike);
        bikeToSave.getItems().forEach(itemMO -> itemMO.setBikeMO(bikeToSave));
        var bikeSaved = bikeMOJpaRepository.saveAndFlush(bikeToSave);
        return bikeMOMapper.fromModel(bikeSaved);
    }

    @Override
    public List<Bike> getBikesFiltered(Filter filter, String orderByName) {
        var sort = orderByName.equalsIgnoreCase(ASC)
            ? Sort.by(Sort.Direction.ASC, PROPERTY_TO_SORT)
            : Sort.by(Sort.Direction.DESC, PROPERTY_TO_SORT);
        var bikesFiltered = bikeMOJpaRepository.getBikesFiltered(filter.getName(), filter.getManufacturer(), filter.getType(),sort);
        return bikesFiltered.stream().map(bikeMOMapper::fromModel).collect(Collectors.toList());
    }


}

