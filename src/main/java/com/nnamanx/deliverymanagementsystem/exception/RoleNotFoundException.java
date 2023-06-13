package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;

public class RoleNotFoundException extends RuntimeException{
    public RoleNotFoundException() {
        super(ExceptionMessage.ROLE_NOT_FOUND_EXCEPTION.name());
    }
}
