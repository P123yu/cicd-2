package com.third.third_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class message {
    @GetMapping
    public String getPipelineMessage(){
        return "pipeline message 2 practice in spring";
    }

}
