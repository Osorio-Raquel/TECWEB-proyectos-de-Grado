package com.rack.apirest.Categoria;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Integer> {
    List<CategoriaModel> findByIsDeleted(int isDeleted);
    Optional<CategoriaModel> findByCategoriaIdAndIsDeleted(Integer categoriaId, int isDeleted);
    List<CategoriaModel> findByNombreAndIsDeleted(String nombre, int isDeleted);
}
