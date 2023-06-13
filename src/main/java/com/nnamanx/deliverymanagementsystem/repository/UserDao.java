package com.nnamanx.deliverymanagementsystem.repository;

import com.nnamanx.deliverymanagementsystem.model.Email;
import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao<S extends MyUser> extends JpaRepository<S, Long> {
    S findByEmail(Email email);

}
