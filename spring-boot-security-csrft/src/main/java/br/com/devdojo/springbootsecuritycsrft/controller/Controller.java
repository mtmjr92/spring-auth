package br.com.devdojo.springbootsecuritycsrft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("controller")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("GET");
    }

    @PostMapping("controller")
    public ResponseEntity<String> post() {
        return ResponseEntity.ok("POST");
    }

}
