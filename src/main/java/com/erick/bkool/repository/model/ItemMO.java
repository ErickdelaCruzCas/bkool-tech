package com.erick.bkool.repository.model;

import com.erick.bkool.model.Bike;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item")
@EntityListeners(AuditingEntityListener.class)
public class ItemMO {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="bike_id", nullable=false)
    private BikeMO bikeMO;

    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @CreatedDate
    private LocalDateTime creationDate;

    @LastModifiedDate
    private LocalDateTime modificationDate;
}
