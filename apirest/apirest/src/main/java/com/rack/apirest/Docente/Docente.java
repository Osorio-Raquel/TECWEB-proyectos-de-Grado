package com.rack.apirest.Docente;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Docente")  // Mapea la clase a la tabla 'Docente'
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT en la tabla
    private Integer docenteId;

    @Basic
    private String nombreCompleto;  // Mapea la columna 'NombreCompleto'

    @Basic
    private int isDeleted;
}
