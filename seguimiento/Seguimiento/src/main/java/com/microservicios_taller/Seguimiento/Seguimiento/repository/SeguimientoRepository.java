package com.microservicios_taller.Seguimiento.Seguimiento.repository;

import com.microservicios_taller.Seguimiento.Seguimiento.model.Seguimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeguimientoRepository extends JpaRepository<Seguimiento, Long> {
    List<Seguimiento> findByCliente_IdCliente(Integer idCliente);
}