package com.mourosub.web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seguros")
public class Seguro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSeguro;

    @Column(nullable = false, length = 150)
    private String nombre;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(nullable = false, length = 150)
    private String compania;

    @Column(nullable = false)
    private Double coberturaGastos;

    @Column(nullable = false)
    private Boolean activo = true;

    // GETTERS Y SETTERS
    public Long getIdSeguro() { return idSeguro; }
    public void setIdSeguro(Long idSeguro) { this.idSeguro = idSeguro; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getCompania() { return compania; }
    public void setCompania(String compania) { this.compania = compania; }

    public Double getCoberturaGastos() { return coberturaGastos; }
    public void setCoberturaGastos(Double coberturaGastos) { this.coberturaGastos = coberturaGastos; }

    public Boolean getActivo() { return activo; }
    public void setActivo(Boolean activo) { this.activo = activo; }
}
