package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.CartRequest;
import com.nnamanx.deliverymanagementsystem.dto.request.OrderRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.CartResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartService {
    List<CartResponse> findAllCarts();

    ResponseEntity<ResponseDto> addCart(CartRequest cartRequest);

    ResponseEntity<ResponseDto> delete(Long id);

    CartResponse findCartById(Long id);
    ResponseEntity<ResponseDto> updateCart(CartRequest cartRequest);

}
