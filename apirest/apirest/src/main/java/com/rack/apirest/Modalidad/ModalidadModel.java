package com.rack.apirest.Modalidad;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Modalidad")
public class ModalidadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int modalidadId;

    @Column(nullable = false, length = 100)
    private String descripcion;

    @Column(nullable = false)
    private int isDeleted;
}
