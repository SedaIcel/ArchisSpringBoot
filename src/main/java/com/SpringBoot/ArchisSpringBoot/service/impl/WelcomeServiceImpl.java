package com.SpringBoot.ArchisSpringBoot.service.impl;

import com.SpringBoot.ArchisSpringBoot.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String sayHi(String name) {
        return "Hello "+name;
    }
}
