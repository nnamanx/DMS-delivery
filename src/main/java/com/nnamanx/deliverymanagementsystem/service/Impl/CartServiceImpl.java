package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.CartRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.CartResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.CartNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.entity.Cart;
import com.nnamanx.deliverymanagementsystem.repository.CartDao;
import com.nnamanx.deliverymanagementsystem.service.CartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartDao cartDao;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<ResponseDto> addCart(CartRequest cartRequest) {
        cartDao.save(modelMapper.map(cartRequest, Cart.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REGISTERED_SUCCESSFULLY.name()));
    }


    @Override
    public List<CartResponse> findAllCarts() {
        return cartDao.findAll().stream()
                .map(cart -> modelMapper.map(cart, CartResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public CartResponse findCartById(Long id) {
        return modelMapper.map(cartDao.findById(id)
                .orElseThrow(CartNotFoundException::new), CartResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateCart(CartRequest cartRequest) {
        cartDao.save(modelMapper.map(cartRequest, Cart.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }

    @Override
    public ResponseEntity<ResponseDto> delete(Long id) {
        cartDao.delete(cartDao.findById(id)
                .orElseThrow(CartNotFoundException::new));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REMOVED_SUCCESSFULLY.name()));
    }
}
