package com.nnamanx.deliverymanagementsystem.repository;

import com.nnamanx.deliverymanagementsystem.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order, Long> {
}
