package com.taller.common.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class FacturaDTO {
    private Long idFactura;
    private LocalDateTime fechaEmision;
    private BigDecimal monto;
    private Long idCita;
}