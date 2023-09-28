package com.form.signup.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

    @Size(max = 40,message = "validation.name.size.too_Long")
    @Size(min = 2, message = "validation.name.size.too_short")
     String name;

     @Email
     @Column(unique = true)
     String email;

     String password;

    @Column(unique = true,nullable = false)
    @Size(min = 10 , max = 10)
     String phone;

     String address;
     String city;
     String state;

    @Column(unique = true,nullable = false,length = 6)
     String pincode;
}
