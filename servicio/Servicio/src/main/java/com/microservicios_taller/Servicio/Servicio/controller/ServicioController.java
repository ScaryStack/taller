package com.microservicios_taller.Servicio.Servicio.controller;

import com.microservicios_taller.Servicio.Servicio.model.Servicio;
import com.microservicios_taller.Servicio.Servicio.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/servicios")
public class ServicioController {

    @Autowired
    private ServicioService service;

    @GetMapping
    public List<Servicio> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servicio> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Servicio create(@RequestBody Servicio servicio) {
        return service.save(servicio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
