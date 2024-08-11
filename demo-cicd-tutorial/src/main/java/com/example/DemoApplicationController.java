package com.example;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class DemoApplicationController {

    @GetMapping("/hello")
    public ResponseEntity<String> getMessage()
    {
        return new ResponseEntity<String>("Hello World! from the rest controller", HttpStatus.OK);
    }
}
