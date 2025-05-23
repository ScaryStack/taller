package com.microservicios_taller.Disponibilidad.Disponibilidad.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "disponibilidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disponibilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDisponibilidad;

    @Column(nullable = false)
    private String estado;
}