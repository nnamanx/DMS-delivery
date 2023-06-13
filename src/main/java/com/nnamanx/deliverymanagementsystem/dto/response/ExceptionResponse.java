package com.nnamanx.deliverymanagementsystem.dto.response;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExceptionResponse {
    String message;
    LocalDateTime localDateTime;
}
