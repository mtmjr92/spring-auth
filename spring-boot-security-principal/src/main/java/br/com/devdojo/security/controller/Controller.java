package br.com.devdojo.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("controller")
    public ResponseEntity<String> get(@AuthenticationPrincipal UserDetails userDetails) {
        return ResponseEntity.ok(userDetails.toString());
    }

}
