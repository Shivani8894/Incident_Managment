package com.example.login.controller;


import com.example.login.modal.Users;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class Login {

    @PostMapping("/login")
    public String login (@RequestBody Users users)
    {
        return (users.getUsername()+ " " +"Login Successfull");
    }

}
