package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;

public class PasswordTokenNotFoundException extends RuntimeException{
    public PasswordTokenNotFoundException() {
        super(ExceptionMessage.PASSWORD_TOKE_NOT_FOUND_EXCEPTION.name());
    }
}
