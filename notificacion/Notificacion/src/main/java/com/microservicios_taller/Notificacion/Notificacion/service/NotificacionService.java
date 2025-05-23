package com.microservicios_taller.Notificacion.Notificacion.service;


import com.microservicios_taller.Notificacion.Notificacion.model.Notificacion;
import com.microservicios_taller.Notificacion.Notificacion.repository.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository repository;

    public List<Notificacion> findAll() {
        return repository.findAll();
    }

    public Optional<Notificacion> findById(Long id) {
        return repository.findById(id);
    }

    public Notificacion save(Notificacion notificacion) {
        return repository.save(notificacion);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
