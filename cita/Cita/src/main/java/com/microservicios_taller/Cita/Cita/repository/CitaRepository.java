package com.microservicios_taller.Cita.Cita.repository;

import com.microservicios_taller.Cita.Cita.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {
}
