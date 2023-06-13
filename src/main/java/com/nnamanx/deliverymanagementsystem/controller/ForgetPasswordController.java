package com.nnamanx.deliverymanagementsystem.controller;

import com.nnamanx.deliverymanagementsystem.dto.request.ForgetPasswordRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ForgetPasswordResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.model.Email;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")

public interface ForgetPasswordController {

    @PostMapping("/reset-password")
    void forgotPassword(@RequestParam("email") Email email);


    @GetMapping("/password-token/{id}")
    ForgetPasswordResponse findPasswordTokenById(@PathVariable Long id);

}
