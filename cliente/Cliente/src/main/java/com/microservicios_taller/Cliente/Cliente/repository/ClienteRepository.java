package com.microservicios_taller.Cliente.Cliente.repository;

import com.microservicios_taller.Cliente.Cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}