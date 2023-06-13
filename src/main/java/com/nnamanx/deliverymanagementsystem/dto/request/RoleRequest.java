package com.nnamanx.deliverymanagementsystem.dto.request;

import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleRequest {
    String id;
    String name;
    List<MyUser> myUser;
}
