package com.microservicios_taller.Notificacion.Notificacion.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private Long idNotification;

    @Column(nullable = false)
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    @JsonBackReference
    private Cliente cliente;

}
