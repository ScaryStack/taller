package com.microservicios_taller.Factura.Factura.service;

import com.microservicios_taller.Factura.Factura.model.Factura;
import com.microservicios_taller.Factura.Factura.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura crearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public Factura obtenerFacturaPorId(Integer id) {
        return facturaRepository.findById(id).orElse(null);
    }

    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }

    public void eliminarFactura(Integer id) {
        facturaRepository.deleteById(id);
    }

    public Factura obtenerPorIdCita(Integer idCita) {
        return facturaRepository.findByIdCita(idCita);
    }
}
