package com.microservicios_taller.Servicio.Servicio.service;

import com.microservicios_taller.Servicio.Servicio.model.Servicio;
import com.microservicios_taller.Servicio.Servicio.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository repository;

    public List<Servicio> findAll() {
        return repository.findAll();
    }

    public Optional<Servicio> findById(Long id) {
        return repository.findById(id);
    }

    public Servicio save(Servicio servicio) {
        return repository.save(servicio);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
