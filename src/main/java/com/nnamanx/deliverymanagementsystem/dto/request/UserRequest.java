package com.nnamanx.deliverymanagementsystem.dto.request;

import com.nnamanx.deliverymanagementsystem.model.entity.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {
    Long id;
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
