package com.erick.bkool.repository;

import com.erick.bkool.domain.Filter;
import com.erick.bkool.repository.model.BikeMO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeMOJpaRepository extends JpaRepository<BikeMO, String> {

    @Query(value =
            "SELECT bike FROM BikeMO bike JOIN bike.items i " +
            "WHERE (:name IS NULL OR bike.name = :name) " +
            "AND (:manufacturer IS NULL OR bike.manufacturer = :manufacturer) " +
            "AND (:type IS NULL OR i.type = :type) ")
    List<BikeMO> getBikesFiltered(String name,
                                  String manufacturer,
                                  String type,
                                  Sort sort);

}
