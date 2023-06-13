package com.nnamanx.deliverymanagementsystem.controller.impl;

import com.nnamanx.deliverymanagementsystem.controller.UserController;
import com.nnamanx.deliverymanagementsystem.dto.request.UserRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.dto.response.UserResponse;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.model.Email;
import com.nnamanx.deliverymanagementsystem.service.UserService;
import com.nnamanx.deliverymanagementsystem.utils.Utils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserControllerImpl implements UserController {


    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<Email, Email> requestMap) {
        try {
            return userService.signUp(requestMap);

        } catch (Exception e) { //customize if needed
            e.printStackTrace();
        }
        return Utils.getResponseEntity(String.valueOf(ResponseMessage.SOMETHING_WENT_WRONG), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public List<UserResponse> findAllUsers() {
        log.info("GET - /user -> request none");
        List<UserResponse> response = userService.findAllUsers();
        log.info("GET - /user -> response: {}", response);
        return response;
    }

    @Override
    public UserResponse findUserById(Long id) throws Throwable {
        log.info("GET - /user/{} -> request", id);
        UserResponse response = userService.findUserById(id);
        log.info("GET - /user -> response: {}", response);
        return response;
    }

    @Override
    public ResponseEntity<ResponseDto> updateUser(UserRequest userRequest) {
        log.info("PUT - /user{} -> request: {}", userRequest);
        ResponseEntity<ResponseDto> response = userService.updateUser(userRequest);
        log.info("PUT - /user{} -> response: {}", response);
        return response;
    }
}
