package com.microservicios_taller.Factura.Factura.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "factura")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;

    private Double monto;
    private LocalDate fechaEmision;
    private String metodoPago;

    @OneToOne
    @JoinColumn(name = "idCita")
    @JsonBackReference
    private Cita cita;

}
