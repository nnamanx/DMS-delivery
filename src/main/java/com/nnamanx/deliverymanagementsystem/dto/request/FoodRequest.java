package com.nnamanx.deliverymanagementsystem.dto.request;

import com.nnamanx.deliverymanagementsystem.model.entity.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodRequest {
    Long id;
    String name;
    double price;
    String description;
    int count;
    String imageURL;
    Category category;
}
