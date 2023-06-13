package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.FoodRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.FoodResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.FoodNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.entity.Food;
import com.nnamanx.deliverymanagementsystem.model.entity.Order;
import com.nnamanx.deliverymanagementsystem.repository.FoodDao;
import com.nnamanx.deliverymanagementsystem.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {
    private final FoodDao foodDao;
    private final ModelMapper modelMapper;


    @Override
    public List<FoodResponse> findAllFood() {
        return (List<FoodResponse>) foodDao.findAll().stream()
                .map(food -> modelMapper.map(food, FoodResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> register(FoodRequest foodRequest) {
        foodDao.save(modelMapper.map(foodRequest, Food.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REGISTERED_SUCCESSFULLY.name()));
    }

    @Override
    public FoodResponse findFoodById(Long id) throws Throwable {
        return modelMapper.map(foodDao.findById(id)
                .orElseThrow(FoodNotFoundException::new), FoodResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateFood(FoodRequest foodRequest) {
        foodDao.save(modelMapper.map(foodRequest, Order.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }

    @Override
    public ResponseEntity<ResponseDto> delete(Long id) throws Throwable {
        foodDao.delete(foodDao.findById(id)
                .orElseThrow(FoodNotFoundException::new));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REMOVED_SUCCESSFULLY.name()));
    }

}
