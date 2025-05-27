package com.microservicios_taller.Servicio.Servicio.repository;

import com.microservicios_taller.Servicio.Servicio.model.Servicio;
import com.taller.common.dto.CitaDTO;
import com.taller.common.dto.VehiculoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer> {
    Servicio findByIdVehiculo(Integer idVehiculo);
    Servicio findByIdDisponibilidad(Integer idDisponibilidad);
}
