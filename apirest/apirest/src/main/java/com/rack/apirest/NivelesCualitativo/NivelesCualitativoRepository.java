package com.rack.apirest.NivelesCualitativo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NivelesCualitativoRepository extends JpaRepository<NivelesCualitativo, Integer> {
    // Obtiene una lista de niveles cualitativos que no están eliminados
    List<NivelesCualitativo> findByIsDeleted(int isDeleted);

    // Busca un nivel cualitativo por ID y que no esté eliminado
    Optional<NivelesCualitativo> findByPuntajeCualitativoIDAndIsDeleted(Integer puntajeCualitativoID, int isDeleted);
    
    // Busca niveles cualitativos por descripción y que no estén eliminados
    List<NivelesCualitativo> findByDescripcionNivelAndIsDeleted(String descripcionNivel, int isDeleted);
}
