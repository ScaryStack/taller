package com.taller.common.dto;

import lombok.Data;
@Data
public class ClienteDTO {
    private Integer idCliente;
    private String nombres;
    private String apellidos;
    private String correo;
}