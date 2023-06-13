package com.nnamanx.deliverymanagementsystem.dto.response;

import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import com.nnamanx.deliverymanagementsystem.model.entity.Order;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverResponse {
    Boolean isBusy;
    MyUser myUser;
    Order order;
}
