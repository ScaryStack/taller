package com.microservicios_taller.Seguimiento.Seguimiento.controller;

import com.microservicios_taller.Seguimiento.Seguimiento.model.Seguimiento;
import com.microservicios_taller.Seguimiento.Seguimiento.service.SeguimientoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/seguimientos")
public class SeguimientoController {

    private final SeguimientoService seguimientoService;

    public SeguimientoController(SeguimientoService seguimientoService) {
        this.seguimientoService = seguimientoService;
    }

    @PostMapping
    public ResponseEntity<Seguimiento> crear(@RequestBody Seguimiento seguimiento) {
        return ResponseEntity.ok(seguimientoService.crear(seguimiento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seguimiento> obtenerPorId(@PathVariable Long id) {
        Seguimiento seguimiento = seguimientoService.obtenerPorId(id);
        return seguimiento != null ? ResponseEntity.ok(seguimiento) : ResponseEntity.notFound().build();
    }

    @GetMapping("/cliente/{idCliente}")
    public ResponseEntity<List<Seguimiento>> listarPorCliente(@PathVariable Integer idCliente) {
        return ResponseEntity.ok(seguimientoService.listarPorCliente(idCliente));
    }

    @GetMapping
    public ResponseEntity<List<Seguimiento>> listarTodos() {
        return ResponseEntity.ok(seguimientoService.listarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        seguimientoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}