package com.nnamanx.deliverymanagementsystem.dto.response;

import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleResponse {
    String name;
    List<MyUser> myUser;
}
