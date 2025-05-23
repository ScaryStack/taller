package com.microservicios_taller.Historial.Historial.model;

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
    private Long idHistorial;

    @Column(nullable = false)
    private String estado;
}
