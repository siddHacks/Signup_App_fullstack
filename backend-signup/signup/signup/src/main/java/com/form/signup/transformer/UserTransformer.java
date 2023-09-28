package com.form.signup.transformer;

import com.form.signup.dto.request.UserRequest;
import com.form.signup.dto.response.UserResponse;
import com.form.signup.models.User;

public class UserTransformer {
    public static User userRequestToUser(UserRequest userRequest){
        return User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .phone(userRequest.getPhone())
                .address(userRequest.getAddress())
                .city(userRequest.getCity())
                .state(userRequest.getState())
                .pincode(userRequest.getPincode())
                .build();
    }

    public static UserResponse userToUserResponse(User user){
        return UserResponse.builder()
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .phone(user.getPhone())
                .address(user.getAddress())
                .city(user.getCity())
                .state(user.getState())
                .pincode(user.getPincode())
                .build();
    }
}
