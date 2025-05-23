package com.microservicios_taller.Historial.Historial.controller;


import com.microservicios_taller.Historial.Historial.model.HistorialCitas;
import com.microservicios_taller.Historial.Historial.service.HistorialCitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/historial-citas")
public class HistorialCitasController {

    @Autowired
    private HistorialCitasService service;

    @GetMapping
    public List<HistorialCitas> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistorialCitas> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(historial -> ResponseEntity.ok(historial))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public HistorialCitas create(@RequestBody HistorialCitas historialCitas) {
        return service.save(historialCitas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
