//package com.example.freelanceplatformdemo1.web;
//
//import com.example.freelanceplatformdemo1.service.UserService;
//import com.example.freelanceplatformdemo1.web.dto.UserRegistrationDto;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/login")
//public class UserLoginController {
//    private UserService userService;
//
//    public UserLoginController(UserService userService) {
//        this.userService = userService;
//    }
//    @GetMapping
//    public String login(){
//        return "login";
//    }
//
//    @PostMapping
//    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
//        userService.save(registrationDto);
//        return "redirect:/login?logout";
//    }
//}
