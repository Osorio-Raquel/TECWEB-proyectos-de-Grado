package com.example.demo1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "hola";
    }
    @GetMapping("/helloSecured")
    public String helloSecured(){
        return "hola mundo";
    }
    
}
