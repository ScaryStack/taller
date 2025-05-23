package com.microservicios_taller.Servicio.Servicio.repository;

import com.microservicios_taller.Servicio.Servicio.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}
