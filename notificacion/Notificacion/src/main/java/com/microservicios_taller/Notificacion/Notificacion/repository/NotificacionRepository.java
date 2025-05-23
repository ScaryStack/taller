package com.microservicios_taller.Notificacion.Notificacion.repository;


import com.microservicios_taller.Notificacion.Notificacion.model.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
}
