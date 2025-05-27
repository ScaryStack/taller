package com.microservicios_taller.Servicio.Servicio.controller;

import com.microservicios_taller.Servicio.Servicio.model.Servicio;
import com.microservicios_taller.Servicio.Servicio.service.ServicioService;
import com.taller.common.dto.CitaDTO;
import com.taller.common.dto.VehiculoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/servicios")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping
    public List<Servicio> getAll() {
        return servicioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servicio> getById(@PathVariable Integer id) {
        return servicioService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/vehiculo/{idVehiculo}")
    public ResponseEntity<Servicio> obtenerPorVehiculo(@PathVariable Integer idVehiculo) {
        Servicio servicio = servicioService.findByIdVehiculo(idVehiculo);
        return servicio != null ? ResponseEntity.ok(servicio) : ResponseEntity.notFound().build();
    }

    @GetMapping("/disponibilidad/{idDisponibilidad}")
    public ResponseEntity<Servicio> obtenerPorDisponibilidad(@PathVariable Integer idDisponibilidad) {
        Servicio servicio = servicioService.findByIdDisponibilidad(idDisponibilidad);
        return servicio != null ? ResponseEntity.ok(servicio) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Servicio create(@RequestBody Servicio servicio) {
        return servicioService.save(servicio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        servicioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
