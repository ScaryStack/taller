package com.microservicios_taller.Seguimiento.Seguimiento.service;

import com.microservicios_taller.Seguimiento.Seguimiento.model.Seguimiento;
import com.microservicios_taller.Seguimiento.Seguimiento.repository.SeguimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguimientoService {

    @Autowired
    private SeguimientoRepository seguimientoRepository;

    public Seguimiento crear(Seguimiento seguimiento) {
        return seguimientoRepository.save(seguimiento);
    }

    public Seguimiento obtenerPorId(Integer id) {
        return seguimientoRepository.findById(id).orElse(null);
    }

    public List<Seguimiento> listarPorCliente(Integer idCliente) {
        return seguimientoRepository.findByIdCliente(idCliente);
    }

    public List<Seguimiento> listarTodos() {
        return seguimientoRepository.findAll();
    }

    public void eliminar(Integer id) {
        seguimientoRepository.deleteById(id);
    }
}