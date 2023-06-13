package com.nnamanx.deliverymanagementsystem.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "forget-password-token")
public class ForgetPasswordToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String token;

    @CreationTimestamp
    LocalDateTime createdAt;
    LocalDateTime confirmedAt;
    Boolean isConfirmed;

    @OneToOne
    MyUser myUser;
}
