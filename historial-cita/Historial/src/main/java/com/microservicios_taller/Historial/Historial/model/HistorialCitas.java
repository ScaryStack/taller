package com.microservicios_taller.Historial.Historial.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Historial_Citas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistorialCitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistorial;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Integer idCita;
}
