package com.bridgeLabz.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting(){
        return "Hello world";
    }
}
