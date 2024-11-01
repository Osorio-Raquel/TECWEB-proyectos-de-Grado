package com.rack.apirest.NivelesCualitativo;

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
@Table(name = "NivelesCualitativo")  // Mapea la clase a la tabla 'NivelesCualitativo'
public class NivelesCualitativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT en la tabla
    private Integer puntajeCualitativoID;

    @Basic
    private String descripcionNivel;  // Mapea la columna 'DescripcionNivel'

    @Basic
    private int isDeleted;  // Indica si el registro está eliminado
}
