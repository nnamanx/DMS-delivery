package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.ForgetPasswordRequest;
import com.nnamanx.deliverymanagementsystem.dto.request.OrderRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ForgetPasswordResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.OrderResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ForgetPasswordService {

    List<ForgetPasswordResponse> findAllPasswordTokens(); //do we need all tokens?

    ResponseEntity<ResponseDto> register(ForgetPasswordRequest forgetPasswordRequest);

    ForgetPasswordResponse findPasswordTokenById(Long id);

    ResponseEntity<ResponseDto> updateForgetPassword(ForgetPasswordRequest forgetPasswordRequest);
}
