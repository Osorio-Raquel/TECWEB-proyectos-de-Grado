package com.rack.apirest.Docente;

import java.util.List; 
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocenteService {

    private final DocenteRepository docenteRepo;

    public void createDocente(Docente docente) {
        docenteRepo.save(docente);
    }

    public List<Docente> getAllDocentes() {
        return docenteRepo.findAll();
    }
}

