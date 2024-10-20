package com.example.demo1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DocenteId")
    private Integer docenteId;

    @Column(name = "NombreCompleto", nullable = false, length = 150)
    private String nombreCompleto;

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
