package com.codegym.demosb.controller;


import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HelloController {
    @GetMapping("sad")
    public String sadssa(){
        return "index";
    }

}
