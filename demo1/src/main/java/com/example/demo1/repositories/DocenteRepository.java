package com.example.demo1.repositories;

import java.util.ArrayList;

import com.example.demo1.models.DocenteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends CrudRepository<DocenteModel, Long> {
    // Método para encontrar docentes por nombre completo
    public abstract ArrayList<DocenteModel> findByNombreCompleto(String nombreCompleto);
}
