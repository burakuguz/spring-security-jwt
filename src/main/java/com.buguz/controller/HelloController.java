package com.buguz.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/rest/hello")
    @PreAuthorize("hasRole('USER')")
    public String hello(){
        return "hello";
    }

    @GetMapping("/adminExp")
    @PreAuthorize("hasRole('ADMIN')")
    public String deneme(){
        return "hello permit";
    }

}
