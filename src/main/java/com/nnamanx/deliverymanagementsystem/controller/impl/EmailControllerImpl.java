package com.nnamanx.deliverymanagementsystem.controller.impl;

import com.nnamanx.deliverymanagementsystem.controller.EmailController;
import com.nnamanx.deliverymanagementsystem.model.Email;
import com.nnamanx.deliverymanagementsystem.service.Impl.EmailServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor



public class EmailControllerImpl implements EmailController {
    private final EmailServiceImpl emailService;

    @Override
    public void sendMail(@RequestBody Email email) {
        emailService.sendMail(email);
    }
}

