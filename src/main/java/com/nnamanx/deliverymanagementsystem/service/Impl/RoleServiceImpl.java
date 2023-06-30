package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.RoleRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.dto.response.RoleResponse;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.RoleNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.entity.Role;
import com.nnamanx.deliverymanagementsystem.repository.RoleDao;
import com.nnamanx.deliverymanagementsystem.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;
    private final ModelMapper modelMapper;

    @Override
    public List<RoleResponse> findAllRoles() {
        return roleDao.findAll().stream()
                .map(product -> modelMapper.map(product, RoleResponse.class))
                .collect(Collectors.toList());
    }

    @Override
// feedback
    //and first pull request

    public ResponseEntity<ResponseDto> register(RoleRequest roleRequest) {
        roleDao.save(modelMapper.map(roleRequest, Role.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REGISTERED_SUCCESSFULLY.name()));
    }

    @Override
    public RoleResponse findRoleById(Long id) {
        return modelMapper.map(roleDao.findById(id)
                .orElseThrow(RoleNotFoundException::new), RoleResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateRole(RoleRequest roleRequest) {
        roleDao.save(modelMapper.map(roleRequest, Role.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }

}
