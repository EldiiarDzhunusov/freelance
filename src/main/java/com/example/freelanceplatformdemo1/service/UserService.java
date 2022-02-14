package com.example.freelanceplatformdemo1.service;

import com.example.freelanceplatformdemo1.model.User;
import com.example.freelanceplatformdemo1.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
    List<User> findAll();
}