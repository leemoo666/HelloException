package com.example.controller;

import com.example.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HiController {

    @Autowired
    HiService hiService;
    @RequestMapping("hello")
    public String hello(@RequestParam(name = "id" ,required = true) String id){
        return hiService.hi(id);

    }

}
