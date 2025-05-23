package com.microservicios_taller.Auth.Auth.repository;

import com.microservicios_taller.Auth.Auth.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Integer> {
    boolean existsByCliente_UsuarioAndCliente_Contrasena(String usuario, String contrasena);
}
