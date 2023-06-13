package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;

public class CartNotFoundException extends RuntimeException{
    public CartNotFoundException() {
        super(ExceptionMessage.CART_NOT_FOUND_EXCEPTION.name());
    }
}
