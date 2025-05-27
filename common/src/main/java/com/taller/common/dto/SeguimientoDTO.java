package com.taller.common.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class SeguimientoDTO {
    private Long idSeguimiento;
    private String descripcion;
    private LocalDateTime fecha;
    private Integer idCliente;
}