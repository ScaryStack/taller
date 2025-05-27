package com.microservicios_taller.Vehiculo.Vehiculo.repository;

import com.microservicios_taller.Vehiculo.Vehiculo.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    List<Vehiculo> findByIdCliente(Integer idCliente);
}