package com.example.demo1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoriaID")
    private Integer categoriaId;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public String getNombre() {
        return nombre;
    }
}