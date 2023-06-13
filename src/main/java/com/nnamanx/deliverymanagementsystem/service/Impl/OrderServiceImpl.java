package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.OrderRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.OrderResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.OrderNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.entity.Order;
import com.nnamanx.deliverymanagementsystem.repository.OrderDao;
import com.nnamanx.deliverymanagementsystem.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderDao orderDao;
    private final ModelMapper modelMapper;

    @Override
    public List<OrderResponse> findAllOrders() {
        return orderDao.findAll().stream()
                .map(product -> modelMapper.map(product, OrderResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> register(OrderRequest orderRequest) {
        orderDao.save(modelMapper.map(orderRequest, Order.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REGISTERED_SUCCESSFULLY.name()));
    }

    @Override
    public OrderResponse findOrderById(Long id) {
        return modelMapper.map(orderDao.findById(id)
                .orElseThrow(OrderNotFoundException::new), OrderResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateOrder(OrderRequest orderRequest) {
        orderDao.save(modelMapper.map(orderRequest, Order.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }

    @Override
    public ResponseEntity<ResponseDto> delete(Long id) {
        orderDao.delete(orderDao.findById(id)
                .orElseThrow(OrderNotFoundException::new));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REMOVED_SUCCESSFULLY.name()));
    }

}
