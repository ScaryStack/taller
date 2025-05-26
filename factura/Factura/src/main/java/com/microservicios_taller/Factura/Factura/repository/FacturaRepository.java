package com.microservicios_taller.Factura.Factura.repository;

import com.microservicios_taller.Factura.Factura.model.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaModel, Long> {
    FacturaModel findByCita_IdCita(Long idCita);
}