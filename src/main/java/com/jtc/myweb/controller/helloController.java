package com.jtc.myweb.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fe
 * @date 2024/04/17 22:48
 **/
@RestController
@RequestMapping
public class helloController {

    @Value("${jtc.myvalue}")
    private String myName;

    @PostConstruct
    public void inint(){
        System.out.println(" helloController init ..." + myName);
    }

    @GetMapping("/hello")
    public String hello(String name){
        return "hello " + name;
    }
}
