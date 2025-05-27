package com.microservicios_taller.Servicio.Servicio.service;

import com.microservicios_taller.Servicio.Servicio.model.Servicio;
import com.microservicios_taller.Servicio.Servicio.repository.ServicioRepository;
import com.taller.common.dto.CitaDTO;
import com.taller.common.dto.VehiculoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }

    public Optional<Servicio> findById(Integer id) {
        return servicioRepository.findById(id);
    }

    public Servicio save(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    public void deleteById(Integer id) {
        servicioRepository.deleteById(id);
    }

    public Servicio findByIdVehiculo(Integer idVehiculo) {
        return servicioRepository.findByIdVehiculo(idVehiculo);
    }

    public Servicio findByIdDisponibilidad(Integer idDisponibilidad) {
        return servicioRepository.findByIdDisponibilidad(idDisponibilidad);
    }

}
