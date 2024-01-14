package com.erick.bkool.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bike {

    private String id;
    private String name;
    private String description;
    private Double price;
    private String manufacturer;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private List<Item> items;


}
