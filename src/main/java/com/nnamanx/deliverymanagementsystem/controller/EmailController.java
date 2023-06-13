package com.nnamanx.deliverymanagementsystem.controller;

import com.nnamanx.deliverymanagementsystem.model.Email;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface EmailController {


    @PostMapping("/email")
    void sendMail(@RequestBody Email email);
}
