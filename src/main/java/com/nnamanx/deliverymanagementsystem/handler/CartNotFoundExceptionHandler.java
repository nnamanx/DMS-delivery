package com.nnamanx.deliverymanagementsystem.handler;

import com.nnamanx.deliverymanagementsystem.dto.response.ExceptionResponse;
import com.nnamanx.deliverymanagementsystem.enums.ExceptionMessage;
import com.nnamanx.deliverymanagementsystem.exception.CartNotFoundException;
import com.nnamanx.deliverymanagementsystem.exception.FoodNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CartNotFoundExceptionHandler {
    @ExceptionHandler({CartNotFoundException.class, CartNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handle() {
        return ExceptionResponse.builder()
                .message(ExceptionMessage.CART_NOT_FOUND_EXCEPTION.name())
                .localDateTime(LocalDateTime.now())
                .build();
    }
}
