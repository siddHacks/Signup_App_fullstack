package com.form.signup.service.serviceImpl;

import com.form.signup.dto.request.UserRequest;
import com.form.signup.dto.response.UserResponse;
import com.form.signup.models.User;
import com.form.signup.repository.UserRepository;
import com.form.signup.service.UserService;
import com.form.signup.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    public UserResponse addDetails(UserRequest userRequest) {
         //dto -> object
        User user = UserTransformer.userRequestToUser(userRequest);
         userRepository.save(user);
        UserResponse userResponse = UserTransformer.userToUserResponse(user);
        return userResponse;
    }
}
