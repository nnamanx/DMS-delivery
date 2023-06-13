package com.nnamanx.deliverymanagementsystem.dto.request;

import com.nnamanx.deliverymanagementsystem.model.entity.Cart;
import com.nnamanx.deliverymanagementsystem.model.entity.Driver;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.OneToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {
    Long id;
    String place;
    Long cardId;
    Boolean status;
    Driver driver;
    Cart cart;
}
