package com.taller.common.dto;

import lombok.Data;
@Data
public class VehiculoDTO {
    private Integer idVehiculo;
    private String patente;
    private String modelo;
    private String marca;
    private String color;
    private Integer idCliente;
}
