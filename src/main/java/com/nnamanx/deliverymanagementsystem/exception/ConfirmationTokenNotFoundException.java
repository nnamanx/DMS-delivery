package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;
import com.nnamanx.deliverymanagementsystem.service.ConfirmationTokenService;

public class ConfirmationTokenNotFoundException extends RuntimeException{
    public ConfirmationTokenNotFoundException() {
        super(ExceptionMessage.CONFIRMATION_TOKEN_NOT_FOUND_EXCEPTION.name());
    }
}
