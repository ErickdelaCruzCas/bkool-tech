package com.erick.bkool.repository;

import com.erick.bkool.repository.model.ItemMO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMOJpaRepository extends JpaRepository<ItemMO, Integer> {

}
