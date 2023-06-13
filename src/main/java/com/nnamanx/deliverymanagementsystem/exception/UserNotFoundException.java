package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException() {
        super(ExceptionMessage.USER_NOT_FOUND_EXCEPTION.name());
    }

}
