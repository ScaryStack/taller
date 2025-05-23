package com.microservicios_taller.Disponibilidad.Disponibilidad.service;

import com.microservicios_taller.Disponibilidad.Disponibilidad.model.Disponibilidad;
import com.microservicios_taller.Disponibilidad.Disponibilidad.repository.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisponibilidadService {

    @Autowired
    private DisponibilidadRepository disponibilidadRepository;

    public List<Disponibilidad> getAllDisponibilidades() {
        return disponibilidadRepository.findAll();
    }

    public Optional<Disponibilidad> getDisponibilidadById(Long id) {
        return disponibilidadRepository.findById(id);
    }

    public Disponibilidad saveDisponibilidad(Disponibilidad disponibilidad) {
        return disponibilidadRepository.save(disponibilidad);
    }

    public void deleteDisponibilidad(Long id) {
        disponibilidadRepository.deleteById(id);
    }

    public Disponibilidad updateDisponibilidad(Long id, Disponibilidad disponibilidadDetails) {
        return disponibilidadRepository.findById(id).map(disponibilidad -> {
            disponibilidad.setEstado(disponibilidadDetails.getEstado());
            return disponibilidadRepository.save(disponibilidad);
        }).orElseThrow(() -> new RuntimeException("Disponibilidad no encontrada con id " + id));
    }
}
