package com.rack.apirest.Docente;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DocenteService {

    private final DocenteRepository docenteRepo;

    public void createDocente(Docente docente) {
        docenteRepo.save(docente);
    }

    public List<Docente> getAllDocentes() {
        return docenteRepo.findByIsDeleted(0);
    }

    public Optional<Docente> getDocenteById(Integer docenteId) {
        return docenteRepo.findByDocenteIdAndIsDeleted(docenteId, 0);
    }

    public List<Docente> getDocentesByNombre(String nombreCompleto) {
        return docenteRepo.findByNombreCompletoAndIsDeleted(nombreCompleto, 0);
    }

    @Transactional
    public void deleteDocente(Integer docenteId) {
        docenteRepo.findById(docenteId).ifPresent(docente -> {
            docente.setIsDeleted(1);
            docenteRepo.save(docente);
        });
    }

    @Transactional
    public void updateDocenteNombre(Integer docenteId, String nuevoNombre) {
        docenteRepo.findById(docenteId).ifPresent(docente -> {
            docente.setNombreCompleto(nuevoNombre);
            docenteRepo.save(docente);
        });
    }
}

