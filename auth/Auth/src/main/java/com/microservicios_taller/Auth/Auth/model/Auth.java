package com.microservicios_taller.Auth.Auth.model;

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

}
