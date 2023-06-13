package com.nnamanx.deliverymanagementsystem.exception;

import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException() {
        super(ExceptionMessage.CATEGORY_NOT_FOUND_EXCEPTION.name());
    }

}
