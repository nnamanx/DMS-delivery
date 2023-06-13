package com.nnamanx.deliverymanagementsystem.dto.response;

import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ForgetPasswordResponse {
    String token;
    LocalDateTime createdAt;
    LocalDateTime confirmedAt;
    Boolean isConfirmed;
    MyUser myUser;
}
