package com.boxer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAA {
    @Autowired
    private  ServiceBB serviceB;

    public void a(){
        System.out.println("ServiceAA execute");
    }
}
