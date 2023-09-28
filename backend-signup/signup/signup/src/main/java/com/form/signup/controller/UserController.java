package com.form.signup.controller;

import com.form.signup.dto.request.UserRequest;
import com.form.signup.dto.response.UserResponse;
import com.form.signup.service.serviceImpl.UserServiceImpl;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/signup")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/add-details")
    public ResponseEntity addDetails(@RequestBody UserRequest userRequest){

       try{
           UserResponse signUp = userService.addDetails(userRequest);
           return new ResponseEntity(signUp, HttpStatus.CREATED);
       }catch(Exception e){
           return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
      }

    }
}
