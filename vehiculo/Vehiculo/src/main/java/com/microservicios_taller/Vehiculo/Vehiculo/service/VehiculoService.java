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
    private VehiculoRepository repository;

    public List<Vehiculo> findAll() {
        return repository.findAll();
    }

    public Optional<Vehiculo> findById(Integer id) {
        return repository.findById(id);
    }

    public Vehiculo save(Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
