package com.gude.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HealthController {

    @GetMapping(value = "")
    public String getHello(){
        return "Hello,world";
    }

}
