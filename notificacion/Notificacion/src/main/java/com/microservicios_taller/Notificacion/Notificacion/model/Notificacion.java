package com.microservicios_taller.Notificacion.Notificacion.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "notificacion")
@Data //Getters para todos los campos
@AllArgsConstructor //Genera un constructor con todos los campos de la clase
@NoArgsConstructor //Genera un constructor vacío (sin argumentos)


public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotification;

    @Column(nullable = false)
    private String mensaje;

    @Column(nullable = false)
    private Integer idCliente;
}
