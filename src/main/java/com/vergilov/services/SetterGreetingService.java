package com.vergilov.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting(){
        return "Hello - i was injected via getter";
    }
}
