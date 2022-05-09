package br.com.devdojo.spring.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("controller")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("GET");
    }

}
