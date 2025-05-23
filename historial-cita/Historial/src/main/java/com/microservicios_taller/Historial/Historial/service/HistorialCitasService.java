package com.microservicios_taller.Historial.Historial.service;


import com.microservicios_taller.Historial.Historial.model.HistorialCitas;
import com.microservicios_taller.Historial.Historial.repository.HistorialCitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialCitasService {

    @Autowired
    private HistorialCitasRepository repository;

    public List<HistorialCitas> findAll() {
        return repository.findAll();
    }

    public Optional<HistorialCitas> findById(Long id) {
        return repository.findById(id);
    }

    public HistorialCitas save(HistorialCitas historialCitas) {
        return repository.save(historialCitas);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
