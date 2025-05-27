package com.microservicios_taller.Auth.Auth.service;

import com.microservicios_taller.Auth.Auth.model.Auth;
import com.microservicios_taller.Auth.Auth.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    public Auth registrar(Auth auth) {
        return authRepository.save(auth);
    }

    public Optional<Auth> autenticar(String usuario, String contrasena) {
        return authRepository.findByUsuario(usuario)
                .filter(auth -> auth.getContrasena().equals(contrasena));
    }
}