package com.microservicios_taller.Disponibilidad.Disponibilidad.repository;


import com.microservicios_taller.Disponibilidad.Disponibilidad.model.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisponibilidadRepository extends JpaRepository<Disponibilidad, Integer> {
}
