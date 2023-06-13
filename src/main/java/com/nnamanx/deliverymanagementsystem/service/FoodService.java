package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.FoodRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.FoodResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FoodService{
    List<FoodResponse> findAllFood();

    ResponseEntity<ResponseDto> register(FoodRequest foodRequest);

    FoodResponse findFoodById(Long id) throws Throwable;

    ResponseEntity<ResponseDto> updateFood(FoodRequest foodRequest);
    ResponseEntity<ResponseDto> delete(Long id) throws Throwable;

}
