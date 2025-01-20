package com.levi.springbootwebappmark5.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class LoginController {
    
    @RequestMapping("/login")
    public String loginstatus() {
        return "You are logged in";
    }
    

}
