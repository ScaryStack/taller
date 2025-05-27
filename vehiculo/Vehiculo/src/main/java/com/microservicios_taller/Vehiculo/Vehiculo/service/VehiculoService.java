package com.microservicios_taller.Vehiculo.Vehiculo.service;

import com.microservicios_taller.Vehiculo.Vehiculo.model.Vehiculo;
import com.microservicios_taller.Vehiculo.Vehiculo.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> obtenerVehiculosPorCliente(Integer idCliente) {
        return vehiculoRepository.findByIdCliente(idCliente);
    }

    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> getVehiculoById(Integer id) {
        return vehiculoRepository.findById(id);
    }

    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void deleteVehiculo(Integer id) {
        vehiculoRepository.deleteById(id);
    }

    public Vehiculo updateVehiculo(Integer id, Vehiculo vehiculoDetails) {
        return vehiculoRepository.findById(id).map(vehiculo -> {
            vehiculo.setColor(vehiculoDetails.getColor());
            vehiculo.setMarca(vehiculoDetails.getMarca());
            vehiculo.setModelo(vehiculoDetails.getModelo());
            vehiculo.setPatente(vehiculoDetails.getPatente());
            return vehiculoRepository.save(vehiculo);
        }).orElseThrow(() -> new RuntimeException("Vehiculo no encontrado con id " + id));
    }
}
