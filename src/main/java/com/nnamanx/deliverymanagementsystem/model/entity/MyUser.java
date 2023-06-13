package com.nnamanx.deliverymanagementsystem.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;


//@NamedQuery(name = "User.findByEmailId", query = "select u from MyUser u where u.email=:email")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "myUser")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    LocalDate birthdate;
    String email;
    String password;
    String resetToken;
    String phoneNumber;
    Boolean isEnabled;
    String role; //vid
    String status; //vid

    @ManyToOne
    Role userRole;


}
