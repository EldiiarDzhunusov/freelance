package com.example.freelanceplatformdemo1.web;


import com.example.freelanceplatformdemo1.model.User;
import com.example.freelanceplatformdemo1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainPageController {
    private UserService userService;

    public MainPageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String home(Model model){
        List<User> listUsers = userService.findAll();
        model.addAttribute("listUsers", listUsers);
        return "index";
    }
}
