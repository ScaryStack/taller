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
    private VehiculoService vehiculoService;

    @GetMapping("/vehiculo-por-cliente/{idCliente}")
    public ResponseEntity<List<Vehiculo>> obtenerPorIdCliente(@RequestParam Integer idCliente) {
        List<Vehiculo> vehiculos = vehiculoService.obtenerVehiculosPorCliente(idCliente);
        return ResponseEntity.ok(vehiculos);
    }

    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.getAllVehiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> getVehiculoById(@PathVariable Integer id) {
        return vehiculoService.getVehiculoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vehiculo createVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.saveVehiculo(vehiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> updateVehiculo(@PathVariable Integer id, @RequestBody Vehiculo vehiculoDetails) {
        try {
            Vehiculo updatedCliente = vehiculoService.updateVehiculo(id, vehiculoDetails);
            return ResponseEntity.ok(updatedCliente);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehiculo(@PathVariable Integer id) {
        vehiculoService.deleteVehiculo(id);
        return ResponseEntity.noContent().build();
    }
}
