package com.form.signup.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserRequest {

    String name;
    String email;
    String password;
    String phone;
    String address;
    String city;
    String state;
    String pincode;
}

