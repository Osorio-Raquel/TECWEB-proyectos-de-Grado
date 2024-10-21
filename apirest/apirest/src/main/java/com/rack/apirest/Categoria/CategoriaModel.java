package com.rack.apirest.Categoria;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Categoria")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int CategoriaID;

    @Basic
    private String Nombre;

    public int getCategoriaID() {
        return CategoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        CategoriaID = categoriaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
