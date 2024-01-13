package com.erick.bkool.model;

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

    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String manufacturer;
    private LocalDateTime creation_date;
    private LocalDateTime modification_date;
    private List<Item> items;


}
