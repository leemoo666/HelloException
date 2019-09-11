package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class HiService {

    public String hi(String id){
        int a = 1 / 0;
        return "hello:"+id;
    }
}
