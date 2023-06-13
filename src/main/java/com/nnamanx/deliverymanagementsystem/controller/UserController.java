package com.nnamanx.deliverymanagementsystem.controller;


import com.nnamanx.deliverymanagementsystem.dto.request.UserRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.dto.response.UserResponse;
import com.nnamanx.deliverymanagementsystem.model.Email;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/user")
public interface UserController {

    @PostMapping("/signup")
    ResponseEntity<String> signUp(@RequestBody(required = true) Map<Email, Email> requestMap);

    @GetMapping("/all-users")
    List<UserResponse> findAllUsers();

    @GetMapping("/{id}")
    UserResponse findUserById(Long id) throws Throwable;

    @PostMapping("/update")
    ResponseEntity<ResponseDto> updateUser(UserRequest userRequest);
}
