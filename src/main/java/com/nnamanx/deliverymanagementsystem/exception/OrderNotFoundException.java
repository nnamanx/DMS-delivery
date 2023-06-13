package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException() {
        super(ExceptionMessage.ORDER_NOT_FOUND_EXCEPTION.name());
    }
}
