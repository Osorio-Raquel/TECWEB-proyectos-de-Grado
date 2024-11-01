package com.rack.apirest.Modalidad;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadRepository extends JpaRepository<ModalidadModel, Integer>{
    List<ModalidadModel> findByIsDeleted(int isDeleted);
    Optional<ModalidadModel> findByModalidadIdAndIsDeleted(Integer modalidadId, int isDeleted);
    List<ModalidadModel> findByDescripcionAndIsDeleted(String descripcion, int isDeleted);
}
