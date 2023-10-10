package com.SpringBoot.ArchisSpringBoot.controller;

import com.SpringBoot.ArchisSpringBoot.service.WelcomeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    private final WelcomeService welcomeService; //dependency injection

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @PostMapping("/sayhi")
    public String sayHi(@RequestBody String name){
        return welcomeService.sayHi(name);
    }

    @GetMapping("/{name}")
    public String getHi(@PathVariable String name){
        return welcomeService.sayHi(name);
    }
}
