package com.nnamanx.deliverymanagementsystem.repository;

import com.nnamanx.deliverymanagementsystem.model.entity.ForgetPasswordToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForgetPasswordDao extends JpaRepository<ForgetPasswordToken, Long> {
}
