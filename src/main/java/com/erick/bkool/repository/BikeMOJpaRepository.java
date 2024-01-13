package com.erick.bkool.repository;

import com.erick.bkool.repository.model.BikeMO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeMOJpaRepository extends JpaRepository<BikeMO, Integer> {

}
