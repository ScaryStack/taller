package com.microservicios_taller.Vehiculo.Vehiculo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "vehiculo")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVehiculo;

    @Column(nullable = false)
    private String patente;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private Integer idCliente;

}




