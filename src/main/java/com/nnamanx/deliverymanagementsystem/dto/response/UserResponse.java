package com.nnamanx.deliverymanagementsystem.dto.response;

import com.nnamanx.deliverymanagementsystem.model.entity.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String name;
    String surname;
    LocalDate birthdate;
    String email;
    String password;
    String phoneNumber;
    Boolean isEnabled;
    String role;
    String status;
    Role userRole;
}
