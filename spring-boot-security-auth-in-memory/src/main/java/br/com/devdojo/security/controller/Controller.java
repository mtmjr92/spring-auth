package br.com.devdojo.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/controller")
    public ResponseEntity<String> controller(){
        return ResponseEntity.ok("Logado!");
    }

}
