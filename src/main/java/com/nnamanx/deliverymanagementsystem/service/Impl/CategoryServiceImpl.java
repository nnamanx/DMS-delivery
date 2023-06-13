package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.CategoryRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.CategoryResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.CategoryNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.entity.Category;
import com.nnamanx.deliverymanagementsystem.repository.CategoryDao;
import com.nnamanx.deliverymanagementsystem.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryDao categoryDao;
    private final ModelMapper modelMapper;


    @Override
    public List<CategoryResponse> findAllCategories() {
        return categoryDao.findAll().stream()
                .map(category -> modelMapper.map(category, CategoryResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest) {
        categoryDao.save(modelMapper.map(categoryRequest, Category.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.REGISTERED_SUCCESSFULLY.name()));
    }

    @Override
    public CategoryResponse findCategoryById(Long id) {
        return modelMapper.map(categoryDao.findById(id)
                .orElseThrow(CategoryNotFoundException::new), CategoryResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateCategory(CategoryRequest categoryRequest) {
        categoryDao.save(modelMapper.map(categoryRequest, Category.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }

}
