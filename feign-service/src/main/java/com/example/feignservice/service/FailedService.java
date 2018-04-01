package com.example.feignservice.service;

import org.springframework.stereotype.Component;

@Component
class FailedService implements SchedualServiceHi{
    @Override
    public String sayHiByFeign(String name) {
        return "hi,"+name+",sorry,error!";
    }
}