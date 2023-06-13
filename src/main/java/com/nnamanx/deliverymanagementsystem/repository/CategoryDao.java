package com.nnamanx.deliverymanagementsystem.repository;

import com.nnamanx.deliverymanagementsystem.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {
}
