package com.example;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoApplicationController {

    @GetMapping("/")
    public ResponseEntity<String> getMessage()
    {
        System.out.println("hello I am invoke in the aws");
        return new ResponseEntity<String>("Hello World! from the rest controller", HttpStatus.OK);
    }
}
