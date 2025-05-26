package com.microservicios_taller.Auth.Auth.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "auth")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAuth;

    @OneToOne
    @MapsId
    @JoinColumn(name = "idCliente")
    @JsonBackReference
    private Cliente cliente;
}
