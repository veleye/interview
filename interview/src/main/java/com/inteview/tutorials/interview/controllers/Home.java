package com.inteview.tutorials.interview.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    
    @RequestMapping("/")
    public String getHomePage(){
        return "qwewq";
    }

}
