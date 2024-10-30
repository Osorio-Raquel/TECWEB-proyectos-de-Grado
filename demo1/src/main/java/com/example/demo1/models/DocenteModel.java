package com.example.demo1.models;

import javax.persistence.*;  // Cambiado a javax

@Entity
@Table(name = "docente")
public class DocenteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long docenteId;

    @Column(nullable = false, length = 150)
    private String nombreCompleto;

    // Getters y Setters

    public Long getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Long docenteId) {
        this.docenteId = docenteId;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
