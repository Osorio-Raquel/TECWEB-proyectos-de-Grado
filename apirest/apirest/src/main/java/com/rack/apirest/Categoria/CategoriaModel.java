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
    private int categoriaId;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private int isDeleted;
}
