package com.microservicios_taller.Factura.Factura.service;

import com.microservicios_taller.Factura.Factura.model.Factura;
import com.microservicios_taller.Factura.Factura.repository.FacturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    private final FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public Factura crearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public Factura obtenerFacturaPorId(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }

    public void eliminarFactura(Long id) {
        facturaRepository.deleteById(id);
    }

    public Factura obtenerPorIdCita(Long idCita) {
        return facturaRepository.findByCita_IdCita(idCita);
    }
}
