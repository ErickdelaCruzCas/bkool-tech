package com.erick.bkool.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

    private String id;
    private Bike bike;
    private String model;
    private String type;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;


}
