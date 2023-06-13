package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.FoodRequest;
import com.nnamanx.deliverymanagementsystem.dto.request.OrderRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.FoodResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.OrderResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderService {
    List<OrderResponse> findAllOrders();

    ResponseEntity<ResponseDto> register(OrderRequest orderRequest);

    OrderResponse findOrderById(Long id);

    ResponseEntity<ResponseDto> updateOrder(OrderRequest orderRequest);

    ResponseEntity<ResponseDto> delete(Long id);
}
