package com.rk.cicdpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
               return "Welcome to CI/CD pipeline...!";
    }
}
