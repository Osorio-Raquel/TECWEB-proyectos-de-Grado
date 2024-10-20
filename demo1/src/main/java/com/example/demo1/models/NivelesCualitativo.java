package com.example.demo1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "NivelesCualitativo")
public class NivelesCualitativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PuntajeCualitativoID")
    private Integer puntajeCualitativoId;

    @Column(name = "DescripcionNivel", nullable = false, length = 150)
    private String descripcionNivel;

    public void setDescripcionNivel(String descripcionNivel) {
        this.descripcionNivel = descripcionNivel;
    }

    public void setPuntajeCualitativoId(Integer puntajeCualitativoId) {
        this.puntajeCualitativoId = puntajeCualitativoId;
    }

    public String getDescripcionNivel() {
        return descripcionNivel;
    }

    public Integer getPuntajeCualitativoId() {
        return puntajeCualitativoId;
    }
}