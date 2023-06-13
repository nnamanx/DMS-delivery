package com.nnamanx.deliverymanagementsystem.dto.request;

import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import com.nnamanx.deliverymanagementsystem.model.entity.Order;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverRequest {
    Long id;
    Boolean isBusy;
    MyUser myUser;
    Order order;
}
