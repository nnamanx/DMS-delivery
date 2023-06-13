package com.nnamanx.deliverymanagementsystem.dto.request;

import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ForgetPasswordRequest {
    Long id;
    String token;
    LocalDateTime createdAt;
    LocalDateTime confirmedAt;
    Boolean isConfirmed;
    MyUser myUser;
}
