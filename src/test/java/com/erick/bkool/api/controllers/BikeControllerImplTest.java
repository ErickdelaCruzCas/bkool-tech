package com.erick.bkool.api.controllers;

import com.erick.bkool.api.mappers.BikeMapper;
import com.erick.bkool.api.mappers.FilterMapper;
import com.erick.bkool.domain.Bike;
import com.erick.bkool.domain.dto.BikeDTO;
import com.erick.bkool.domain.dto.FilterDTO;
import com.erick.bkool.service.BikeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BikeControllerImplTest {

    @Mock
    private BikeService bikeService;

    @Mock
    private BikeMapper bikeMapper;

    @Mock
    private FilterMapper filterMapper;

    @InjectMocks
    private BikeControllerImpl bikeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateBike() {
        when(bikeService.createBike(any())).thenReturn(new Bike());
        BikeDTO bikeDTO = new BikeDTO();
        ResponseEntity<BikeDTO> responseEntity = bikeController.createBike(bikeDTO);
        verify(bikeService, times(1)).createBike(any());
        verify(bikeMapper, times(1)).toDTO(any());
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    void testGetBikesByFilter() {
        when(bikeService.getBikesByFilter(any(), anyString())).thenReturn(Arrays.asList(new Bike(), new Bike()));
        FilterDTO filterDTO = new FilterDTO();
        ResponseEntity<List<BikeDTO>> responseEntity = bikeController.getBikesByFilter("orderByName", filterDTO);
        verify(bikeService, times(1)).getBikesByFilter(any(), eq("orderByName"));
        verify(bikeMapper, times(2)).toDTO(any());
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
