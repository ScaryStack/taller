package com.microservicios_taller.Factura.Factura.controller;

import com.microservicios_taller.Factura.Factura.model.Factura;
import com.microservicios_taller.Factura.Factura.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping
    public ResponseEntity<Factura> crear(@RequestBody Factura factura) {
        return ResponseEntity.ok(facturaService.crearFactura(factura));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> obtenerPorId(@PathVariable Integer id) {
        Factura factura = facturaService.obtenerFacturaPorId(id);
        return factura != null ? ResponseEntity.ok(factura) : ResponseEntity.notFound().build();
    }

    @GetMapping("/cita/{idCita}")
    public ResponseEntity<Factura> obtenerPorCita(@PathVariable Integer idCita) {
        Factura factura = facturaService.obtenerPorIdCita(idCita);
        return factura != null ? ResponseEntity.ok(factura) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Factura>> listar() {
        return ResponseEntity.ok(facturaService.listarFacturas());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        facturaService.eliminarFactura(id);
        return ResponseEntity.noContent().build();
    }
}