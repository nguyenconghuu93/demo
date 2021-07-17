package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    public ResponseEntity<?> test() {
        Response response = new Response();
        response.setMessage("feature 2");
        response.setErrorCode("00000");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
