package br.com.devdojo.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("controller")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("GET");
    }

    @PostMapping("save")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> save() {
        return ResponseEntity.ok("SAVE");
    }

}
