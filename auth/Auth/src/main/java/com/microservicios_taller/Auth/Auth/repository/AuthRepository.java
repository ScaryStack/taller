package com.microservicios_taller.Auth.Auth.repository;

import com.microservicios_taller.Auth.Auth.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Integer> {
    Optional<Auth> findByUsuario(String usuario);
}
