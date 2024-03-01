package com.estsoft.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/bye")
    public String bye(){
        return "bye2";
    }
}
