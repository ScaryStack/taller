package com.microservicios_taller.Auth.Auth.controller;

import com.microservicios_taller.Auth.Auth.model.Auth;
import com.microservicios_taller.Auth.Auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Auth> registrar(@RequestBody Auth auth) {
        return ResponseEntity.ok(authService.registrar(auth));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String usuario,
                                        @RequestParam String contrasena) {
        return authService.autenticar(usuario, contrasena)
                .map(auth -> ResponseEntity.ok("Login exitoso para cliente ID: " + auth.getIdCliente()))
                .orElse(ResponseEntity.status(401).body("Credenciales incorrectas"));
    }
}