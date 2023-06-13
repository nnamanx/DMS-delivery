package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.UserRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.dto.response.UserResponse;
import com.nnamanx.deliverymanagementsystem.model.Email;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserResponse> findAllUsers();

    UserResponse findUserById(Long id) throws Throwable;

    ResponseEntity<ResponseDto> updateUser(UserRequest userRequest);

    ResponseEntity<String> signUp(Map<Email, Email> requestMap);

    void sendPasswordResetEmail(Email email);

    //update user password


}
