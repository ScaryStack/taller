package com.microservicios_taller.Factura.Factura.repository;

import com.microservicios_taller.Factura.Factura.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {
    Factura findByIdCita(Integer idCita);
}