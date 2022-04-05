package com.aws.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class TestController {
    @GetMapping("/{name}")
    public String test(@PathVariable String name){
        return "Hello "+name +" Welcome to aws world";
    }
}
