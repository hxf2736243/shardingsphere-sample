package com.boxer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    @Autowired
    private ServiceB serviceB;
    public void a(){
        System.out.println("ServiceA execute");
    }
}
