package com.nnamanx.deliverymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodDao extends JpaRepository<FoodDao, Long> {
}
