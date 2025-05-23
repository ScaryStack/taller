package com.microservicios_taller.Vehiculo.Vehiculo.controller;

import com.microservicios_taller.Vehiculo.Vehiculo.model.Vehiculo;
import com.microservicios_taller.Vehiculo.Vehiculo.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService service;

    @GetMapping
    public List<Vehiculo> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vehiculo create(@RequestBody Vehiculo vehiculo) {
        return service.save(vehiculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
