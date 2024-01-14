package com.erick.bkool.api.controllers;

import com.erick.bkool.api.BikeApiDelegate;
import com.erick.bkool.api.mappers.BikeMapper;
import com.erick.bkool.api.mappers.FilterMapper;
import com.erick.bkool.domain.dto.BikeDTO;
import com.erick.bkool.domain.dto.FilterDTO;
import com.erick.bkool.service.BikeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@AllArgsConstructor
class BikeControllerImpl implements BikeApiDelegate {

    private final BikeService bikeService;
    private final BikeMapper bikeMapper;
    private final FilterMapper filterMapper;

    @Override
    public ResponseEntity<BikeDTO> createBike(BikeDTO bikeDTO) {
        log.info("ENDPOINT: POST /bike with params: {}", bikeDTO);
        var bikeCreated =  this.bikeService.createBike(
                this.bikeMapper.toModel(bikeDTO)
        );
        return ResponseEntity.ok(bikeMapper.toDTO(bikeCreated));
    }

    @Override
    public ResponseEntity<List<BikeDTO>> getBikesByFilter(String orderByName,
                                                          FilterDTO filterDTO) {
        log.info("ENDPOINT: POST /bike/list with params: {}, and {}", filterDTO, orderByName);
        var bikesFiltered = this.bikeService.getBikesByFilter(filterMapper.toModel(filterDTO), orderByName);
        var bikesDTOFiltered = bikesFiltered.stream().map(bikeMapper::toDTO).collect(Collectors.toList());
        return ResponseEntity.ok(bikesDTOFiltered);
    }

}
