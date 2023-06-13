package com.nnamanx.deliverymanagementsystem.service;

import com.nnamanx.deliverymanagementsystem.dto.request.CategoryRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.CategoryResponse;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> findAllCategories();

    ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest);

    CategoryResponse findCategoryById(Long id);

    ResponseEntity<ResponseDto> updateCategory(CategoryRequest categoryRequest);
}
