package com.nnamanx.deliverymanagementsystem.dto.response;

import com.nnamanx.deliverymanagementsystem.model.entity.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodResponse {
    String name;
    double price;
    String description;
    int count;
    String imageURL;
    Category category;
}
