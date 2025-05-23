package com.microservicios_taller.Historial.Historial.repository;


import com.microservicios_taller.Historial.Historial.model.HistorialCitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialCitasRepository extends JpaRepository<HistorialCitas, Long> {
}
