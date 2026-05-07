package com.mourosub.web.model;

import jakarta.persistence.*;
import java.time.LocalDate;
//Indicamos a spring que esto es una tabla de la base de datos
import java.sql.Date;
@Entity

@Table(name = "Alquileres")
public class Alquileres {
    //Clave principal
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAlquiler;
    
    @Column (nullable = false)
    private LocalDate fechaAlquiler;

    private LocalDate fechaDevolucion;

    @Column (nullable = false)
    private Double precioTotal;

    @Column (nullable = false)
    private Boolean disponible = true;

    // RELACIÓN MUCHOS A UNO CON MATERIAL
    @ManyToOne
    @JoinColumn(name = "id_material", nullable = false)
    private Material material;

    // RELACIÓN MUCHOS A UNO CON SEGURO
    @ManyToOne
    @JoinColumn(name = "id_seguro", nullable = false)
    private Seguro seguro;

    // RELACIÓN MUCHOS A UNO CON ACTIVIDAD
    @ManyToOne
    @JoinColumn(name = "id_actividad", nullable = false)
    private Actividad actividad;

    // GETTERS Y SETTERS
    public Long getIdAlquiler() { return idAlquiler; }
    public void setIdAlquiler(Long idAlquiler) { this.idAlquiler = idAlquiler; }

    public LocalDate getFechaAlquiler() { return fechaAlquiler; }
    public void setFechaAlquiler(LocalDate fechaAlquiler) { this.fechaAlquiler = fechaAlquiler; }

    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(LocalDate fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }

    public Double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(Double precioTotal) { this.precioTotal = precioTotal; }

    public Boolean getDisponible() { return disponible; }
    public void setDisponible(Boolean disponible) { this.disponible = disponible; }

    public Material getMaterial() { return material; }
    public void setMaterial(Material material) { this.material = material; }

    public Seguro getSeguro() { return seguro; }
    public void setSeguro(Seguro seguro) { this.seguro = seguro; }

    public Actividad getActividad() { return actividad; }
    public void setActividad(Actividad actividad) { this.actividad = actividad; }
}
