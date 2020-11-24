package com.mesut.springWeb.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerHome {
    @GetMapping("/")
    public String showHomePage(){
        return "Home Page";
    }
    @GetMapping("/home")
    public String showHomePage2(){
        return "Home Page";
    }
}
