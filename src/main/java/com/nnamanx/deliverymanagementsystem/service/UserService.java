package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.UserRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.dto.response.UserResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserResponse> findAllUsers();

//    ResponseEntity<ResponseDto> register(UserRequest userRequest);

    UserResponse findUserById(Long id) throws Throwable;

    ResponseEntity<ResponseDto> updateUser(UserRequest userRequest);

    ResponseEntity<String> signUp(Map<String, String> requestMap);

    //update user password


}
