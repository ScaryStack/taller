package com.microservicios_taller.Cita.Cita.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cita")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCita;

    @Column(nullable = false)
    private String mensajeCita;

    @ManyToOne
    @JoinColumn(name = "idServicio")
    @JsonBackReference
    private Servicio servicio;

    @OneToOne(mappedBy = "cita", cascade = CascadeType.ALL)
    @JsonManagedReference
    private HistorialCitas historial;

    @OneToOne(mappedBy = "cita", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Factura factura;

}