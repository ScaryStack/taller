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
    private NotificacionRepository notificacionRepository;

    public List<Notificacion> findAll() {
        return notificacionRepository.findAll();
    }

    public Optional<Notificacion> findById(Integer id) {
        return notificacionRepository.findById(id);
    }

    public Notificacion save(Notificacion notificacion) {
        return notificacionRepository.save(notificacion);
    }

    public void deleteById(Integer id) {
        notificacionRepository.deleteById(id);
    }

    public Notificacion findByIdCliente(Integer idCliente) {
        return notificacionRepository.findByIdCliente(idCliente);
    }
}
