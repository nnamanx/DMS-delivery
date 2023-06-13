package com.nnamanx.deliverymanagementsystem.dto.response;

import com.nnamanx.deliverymanagementsystem.model.entity.Cart;
import com.nnamanx.deliverymanagementsystem.model.entity.Food;
import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartResponse {
    int count;
    double totalAmount;
    List<Food> food;
    Cart cart;
    MyUser myUser;
}
