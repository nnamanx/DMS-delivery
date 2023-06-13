package com.nnamanx.deliverymanagementsystem.dto.request;

import com.nnamanx.deliverymanagementsystem.model.entity.Food;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryRequest {
    Long id;
    String name;
    String description;
    List<Food> food;
}
