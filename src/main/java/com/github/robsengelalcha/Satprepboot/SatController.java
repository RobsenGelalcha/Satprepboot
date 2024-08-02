package com.github.robsengelalcha.Satprepboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SatController {



    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }
    
}
