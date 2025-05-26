package com.microservicios_taller.Factura.Factura.controller;

import com.microservicios_taller.Factura.Factura.model.FacturaModel;
import com.microservicios_taller.Factura.Factura.service.FacturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/facturas")
public class FacturaController {

    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @PostMapping
    public ResponseEntity<FacturaModel> crear(@RequestBody FacturaModel factura) {
        return ResponseEntity.ok(facturaService.crearFactura(factura));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacturaModel> obtenerPorId(@PathVariable Long id) {
        FacturaModel factura = facturaService.obtenerFacturaPorId(id);
        return factura != null ? ResponseEntity.ok(factura) : ResponseEntity.notFound().build();
    }

    @GetMapping("/cita/{idCita}")
    public ResponseEntity<FacturaModel> obtenerPorCita(@PathVariable Long idCita) {
        FacturaModel factura = facturaService.obtenerPorIdCita(idCita);
        return factura != null ? ResponseEntity.ok(factura) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<FacturaModel>> listar() {
        return ResponseEntity.ok(facturaService.listarFacturas());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        facturaService.eliminarFactura(id);
        return ResponseEntity.noContent().build();
    }
}