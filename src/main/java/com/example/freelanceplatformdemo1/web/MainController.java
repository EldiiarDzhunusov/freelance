package com.example.freelanceplatformdemo1.web;

import com.example.freelanceplatformdemo1.model.User;
import com.example.freelanceplatformdemo1.repository.UserRepository;
import com.example.freelanceplatformdemo1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
//
//    @PostMapping("/login")
//    public String postLogin(){
//        return "login";
//    }



}
