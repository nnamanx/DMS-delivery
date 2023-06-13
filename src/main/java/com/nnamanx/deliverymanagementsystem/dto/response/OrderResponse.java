package com.nnamanx.deliverymanagementsystem.dto.response;

import com.nnamanx.deliverymanagementsystem.model.entity.Cart;
import com.nnamanx.deliverymanagementsystem.model.entity.Driver;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponse {
    String place;
    Long cardId;
    Boolean status;
    Driver driver;
    Cart cart;
}
