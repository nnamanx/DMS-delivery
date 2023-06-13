package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.ForgetPasswordRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ForgetPasswordResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.PasswordTokenNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.entity.ForgetPasswordToken;
import com.nnamanx.deliverymanagementsystem.repository.ForgetPasswordDao;
import com.nnamanx.deliverymanagementsystem.service.ForgetPasswordService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ForgetPasswordServiceImpl implements ForgetPasswordService {
    private final ForgetPasswordDao forgetPasswordDao;
    private final ModelMapper modelMapper;

    @Override
    public List<ForgetPasswordResponse> findAllPasswordTokens() {
        return forgetPasswordDao.findAll().stream()
                .map(passwordToken -> modelMapper.map(passwordToken, ForgetPasswordResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> register(ForgetPasswordRequest forgetPasswordRequest) {
        forgetPasswordDao.save(modelMapper.map(forgetPasswordDao, ForgetPasswordToken.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REGISTERED_SUCCESSFULLY.name()));
    }

    @Override
    public ForgetPasswordResponse findPasswordTokenById(Long id) {
        return modelMapper.map(forgetPasswordDao.findById(id)
                .orElseThrow(PasswordTokenNotFoundException::new), ForgetPasswordResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateForgetPassword(ForgetPasswordRequest forgetPasswordRequest) {
        forgetPasswordDao.save(modelMapper.map(forgetPasswordDao, ForgetPasswordToken.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }

}
