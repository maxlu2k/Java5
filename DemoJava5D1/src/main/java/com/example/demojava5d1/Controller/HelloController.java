package com.example.demojava5d1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/index")
    public String hello(){
        return "index";
    }
}
