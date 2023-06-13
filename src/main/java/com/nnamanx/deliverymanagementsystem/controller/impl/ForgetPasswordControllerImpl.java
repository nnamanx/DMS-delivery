package com.nnamanx.deliverymanagementsystem.controller.impl;

import com.nnamanx.deliverymanagementsystem.controller.ForgetPasswordController;
import com.nnamanx.deliverymanagementsystem.dto.request.ForgetPasswordRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ForgetPasswordResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.model.Email;
import com.nnamanx.deliverymanagementsystem.service.ForgetPasswordService;
import com.nnamanx.deliverymanagementsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ForgetPasswordControllerImpl implements ForgetPasswordController {

    private final UserService userService;

    @Override
    public void forgotPassword(@RequestBody Email email) {
        userService.sendPasswordResetEmail(email);
    }

    @Override
    public ForgetPasswordResponse findPasswordTokenById(@PathVariable Long id) {
        return null;
    }

}
