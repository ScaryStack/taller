package com.microservicios_taller.Servicio.Servicio.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "servicio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;

    @Column(nullable = false)
    private String tipoServicio;

    @ManyToOne
    @JoinColumn(name = "idVehiculo")
    @JsonBackReference
    private Vehiculo vehiculo;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Disponibilidad> disponibilidades;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Cita> citas;

}
