package com.nnamanx.deliverymanagementsystem.repository;

import com.nnamanx.deliverymanagementsystem.model.entity.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenDao extends JpaRepository<ConfirmationToken, Long> {
}
