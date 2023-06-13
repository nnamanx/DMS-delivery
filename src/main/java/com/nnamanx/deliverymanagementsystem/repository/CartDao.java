package com.nnamanx.deliverymanagementsystem.repository;

import com.nnamanx.deliverymanagementsystem.model.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDao extends JpaRepository<Cart, Long> {
}
