package com.microservicios_taller.Notificacion.Notificacion.controller;


import com.microservicios_taller.Notificacion.Notificacion.model.Notificacion;
import com.microservicios_taller.Notificacion.Notificacion.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService service;

    @GetMapping
    public List<Notificacion> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notificacion> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Notificacion create(@RequestBody Notificacion notificacion) {
        return service.save(notificacion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
