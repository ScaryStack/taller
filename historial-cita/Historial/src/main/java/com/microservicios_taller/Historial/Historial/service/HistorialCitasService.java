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
    private HistorialCitasRepository historialCitasRepository;

    public List<HistorialCitas> findAll() {
        return historialCitasRepository.findAll();
    }

    public Optional<HistorialCitas> findById(Integer id) {
        return historialCitasRepository.findById(id);
    }

    public HistorialCitas save(HistorialCitas historialCitas) {
        return historialCitasRepository.save(historialCitas);
    }

    public void deleteById(Integer id) {
        historialCitasRepository.deleteById(id);
    }

    public HistorialCitas obtenerPorIdCita(Integer idCita) {
        return historialCitasRepository.findByIdCita(idCita);
    }
}
