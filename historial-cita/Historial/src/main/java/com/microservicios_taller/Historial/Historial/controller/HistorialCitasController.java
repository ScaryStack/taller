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
    private HistorialCitasService historialCitasService;

    @GetMapping
    public List<HistorialCitas> getAll() {
        return historialCitasService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistorialCitas> getById(@PathVariable Integer id) {
        return historialCitasService.findById(id)
                .map(historial -> ResponseEntity.ok(historial))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/cita/{idCita}")
    public ResponseEntity<HistorialCitas> obtenerPorCita(@PathVariable Integer idCita) {
        HistorialCitas historialCitas = historialCitasService.obtenerPorIdCita(idCita);
        return historialCitas != null ? ResponseEntity.ok(historialCitas) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public HistorialCitas create(@RequestBody HistorialCitas historialCitas) {
        return historialCitasService.save(historialCitas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        historialCitasService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
