package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;

public class FoodNotFoundException extends RuntimeException{
    public FoodNotFoundException() {
        super(ExceptionMessage.FOOD_NOT_FOUND_EXCEPTION.name());
    }
}
