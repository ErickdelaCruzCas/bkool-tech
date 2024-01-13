package com.erick.bkool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

    private Integer id;
    private Bike bike;
    private String model;
    private String type;
    private String description;
    @CreatedDate
    private LocalDateTime creation_date;
    @LastModifiedDate
    private LocalDateTime modification_date;


}
