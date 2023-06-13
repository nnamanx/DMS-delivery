package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.ConfirmationTokenRequest;
import com.nnamanx.deliverymanagementsystem.dto.request.OrderRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ConfirmationTokenResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.OrderResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.ConfirmationTokenNotFoundException;
import com.nnamanx.deliverymanagementsystem.exception.OrderNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.entity.ConfirmationToken;
import com.nnamanx.deliverymanagementsystem.model.entity.Order;
import com.nnamanx.deliverymanagementsystem.repository.ConfirmationTokenDao;
import com.nnamanx.deliverymanagementsystem.service.ConfirmationTokenService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ConfirmationTokenServiceImpl implements ConfirmationTokenService {
    private final ConfirmationTokenDao confirmationTokenDao;
    private final ModelMapper modelMapper;



    @Override
    public List<ConfirmationTokenResponse> findAllConfirmationTokens() {
        return confirmationTokenDao.findAll().stream()
                .map(confirmationToken -> modelMapper.map(confirmationToken, ConfirmationTokenResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> register(ConfirmationTokenRequest confirmationTokenRequest) {
        confirmationTokenDao.save(modelMapper.map(confirmationTokenRequest, ConfirmationToken.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REGISTERED_SUCCESSFULLY.name()));
    }

    @Override
    public ConfirmationTokenResponse findConfirmationTokenById(Long id) {
        return modelMapper.map(confirmationTokenDao.findById(id)
                .orElseThrow(ConfirmationTokenNotFoundException::new), ConfirmationTokenResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateConfirmationToken(ConfirmationTokenRequest confirmationTokenRequest) {
        confirmationTokenDao.save(modelMapper.map(confirmationTokenRequest, ConfirmationToken.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }

}
