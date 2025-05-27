package com.taller.common.dto;

import lombok.Data;
@Data
public class NotificacionDTO {
    private Long idNotification;
    private String mensaje;
    private Integer idCliente;
}
