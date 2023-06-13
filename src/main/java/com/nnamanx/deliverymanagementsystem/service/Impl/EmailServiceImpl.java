package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
    private final ModelMapper modelMapper;


}
