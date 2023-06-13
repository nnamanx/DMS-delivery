package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.FoodRequest;
import com.nnamanx.deliverymanagementsystem.dto.request.RoleRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.FoodResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.dto.response.RoleResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoleService {
    List<RoleResponse> findAllRoles();

    ResponseEntity<ResponseDto> register(RoleRequest roleRequest);

    RoleResponse findRoleById(Long id);

    ResponseEntity<ResponseDto> updateRole(RoleRequest roleRequest);
}
