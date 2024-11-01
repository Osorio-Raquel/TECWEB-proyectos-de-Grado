package com.rack.apirest.Docente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer> {
    List<Docente> findByIsDeleted(int isDeleted);
    // Busca un docente por ID y que no esté eliminado
    Optional<Docente> findByDocenteIdAndIsDeleted(Integer docenteId, int isDeleted);
    
    // Busca docentes por nombre completo y que no estén eliminados
    List<Docente> findByNombreCompletoAndIsDeleted(String nombreCompleto, int isDeleted);
}
