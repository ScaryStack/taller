package com.microservicios_taller.Disponibilidad.Disponibilidad.controller;

import com.microservicios_taller.Disponibilidad.Disponibilidad.model.Disponibilidad;
import com.microservicios_taller.Disponibilidad.Disponibilidad.service.DisponibilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/disponibilidad")
public class DisponibilidadController {

    @Autowired
    private DisponibilidadService disponibilidadService;

    @GetMapping
    public List<Disponibilidad> getAllDisponibilidades() {
        return disponibilidadService.getAllDisponibilidades();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disponibilidad> getDisponibilidadById(@PathVariable Integer id) {
        return disponibilidadService.getDisponibilidadById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Disponibilidad createDisponibilidad(@RequestBody Disponibilidad disponibilidad) {
        return disponibilidadService.saveDisponibilidad(disponibilidad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Disponibilidad> updateDisponibilidad(@PathVariable Integer id, @RequestBody Disponibilidad disponibilidadDetails) {
        try {
            Disponibilidad updatedDisponibilidad = disponibilidadService.updateDisponibilidad(id, disponibilidadDetails);
            return ResponseEntity.ok(updatedDisponibilidad);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisponibilidad(@PathVariable Integer id) {
        disponibilidadService.deleteDisponibilidad(id);
        return ResponseEntity.noContent().build();
    }
}
