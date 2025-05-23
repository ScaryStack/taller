package com.microservicios_taller.Auth.Auth.service;

import com.microservicios_taller.Auth.Auth.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    public boolean autenticar(String usuario, String contrasena) {
        return authRepository.existsByCliente_UsuarioAndCliente_Contrasena(usuario, contrasena);
    }
}
