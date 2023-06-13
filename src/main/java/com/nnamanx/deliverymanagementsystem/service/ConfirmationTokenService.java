package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.ConfirmationTokenRequest;
import com.nnamanx.deliverymanagementsystem.dto.request.OrderRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ConfirmationTokenResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.OrderResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ConfirmationTokenService {
    List<ConfirmationTokenResponse> findAllConfirmationTokens(); // needed?

    ResponseEntity<ResponseDto> register(ConfirmationTokenRequest confirmationTokenRequest);

    ConfirmationTokenResponse findConfirmationTokenById(Long id);

    ResponseEntity<ResponseDto> updateConfirmationToken(ConfirmationTokenRequest confirmationTokenRequest);
}
