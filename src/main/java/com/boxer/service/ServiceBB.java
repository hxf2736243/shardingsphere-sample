package com.boxer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBB {


    @Autowired
    private  ServiceAA serviceAA;


    public void b(){
        serviceAA.a();
    }
}
