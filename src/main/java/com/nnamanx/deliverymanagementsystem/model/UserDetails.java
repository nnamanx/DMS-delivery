package com.nnamanx.deliverymanagementsystem.model;

import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;

public class UserDetails extends MyUser {
    public UserDetails(MyUser myUser) {
        super.setName(myUser.getName());
        super.setSurname(myUser.getSurname());
        super.setStatus(myUser.getStatus());
        super.setRole(myUser.getRole());

    }

}