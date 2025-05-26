package com.microservicios_taller.Seguimiento.Seguimiento.service;

import com.microservicios_taller.Seguimiento.Seguimiento.model.Seguimiento;
import com.microservicios_taller.Seguimiento.Seguimiento.repository.SeguimientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguimientoService {

    private final SeguimientoRepository seguimientoRepository;

    public SeguimientoService(SeguimientoRepository seguimientoRepository) {
        this.seguimientoRepository = seguimientoRepository;
    }

    public Seguimiento crear(Seguimiento seguimiento) {
        return seguimientoRepository.save(seguimiento);
    }

    public Seguimiento obtenerPorId(Long id) {
        return seguimientoRepository.findById(id).orElse(null);
    }

    public List<Seguimiento> listarPorCliente(Integer idCliente) {
        return seguimientoRepository.findByCliente_IdCliente(idCliente);
    }

    public List<Seguimiento> listarTodos() {
        return seguimientoRepository.findAll();
    }

    public void eliminar(Long id) {
        seguimientoRepository.deleteById(id);
    }
}