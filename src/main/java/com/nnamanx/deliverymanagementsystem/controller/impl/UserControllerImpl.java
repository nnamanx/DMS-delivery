package com.nnamanx.deliverymanagementsystem.controller.impl;

import com.nnamanx.deliverymanagementsystem.controller.UserController;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.service.UserService;
import com.nnamanx.deliverymanagementsystem.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {


    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            return userService.signUp(requestMap);

        } catch (Exception e) { //customize if needed
            e.printStackTrace();
        }
        return Utils.getResponseEntity(String.valueOf(ResponseMessage.SOMETHING_WENT_WRONG), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
