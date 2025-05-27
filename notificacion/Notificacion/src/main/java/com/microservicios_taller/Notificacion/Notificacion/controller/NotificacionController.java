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
    private NotificacionService notificacionService;

    @GetMapping
    public List<Notificacion> getAll() {
        return notificacionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notificacion> getById(@PathVariable Integer id) {
        return notificacionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/cliente/{idCliente}")
    public ResponseEntity<Notificacion> obtenerPorCliente(@PathVariable Integer idCliente) {
        Notificacion notificacion = notificacionService.findByIdCliente(idCliente);
        return notificacion != null ? ResponseEntity.ok(notificacion) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Notificacion create(@RequestBody Notificacion notificacion) {
        return notificacionService.save(notificacion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        notificacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
