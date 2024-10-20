package com.example.demo1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Modalidad")
public class Modalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ModalidadID")
    private Integer modalidadId;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String descripcion;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setModalidadId(Integer modalidadId) {
        this.modalidadId = modalidadId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getModalidadId() {
        return modalidadId;
    }
}
