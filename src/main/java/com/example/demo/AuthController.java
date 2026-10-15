package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login-static")
    public ResponseEntity<String> login(
            @RequestBody Map<String, String> credentials) {

        if ("admin".equals(credentials.get("username")) &&
            "password123".equals(credentials.get("password"))) {

            return ResponseEntity.ok("Authentication Successful");
        }

        return ResponseEntity.status(401)
                .body("Authentication Failed");
    }
}