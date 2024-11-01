package com.rack.apirest.Docente;

import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/docente")
@RequiredArgsConstructor
public class DocenteController {

    private final DocenteService docenteService;

    @PostMapping
    public void createDocente(@RequestBody Docente docente) {
        docenteService.createDocente(docente);
    }

    @GetMapping
    public List<Docente> getAllDocentes() {
        return docenteService.getAllDocentes();
    }

    @GetMapping("/{id}")
    public Docente getDocenteById(@PathVariable Integer id) {
        return docenteService.getDocenteById(id).orElse(null);
    }

    @GetMapping("/buscar")
    public List<Docente> getDocentesByNombre(@RequestParam String nombreCompleto) {
        return docenteService.getDocentesByNombre(nombreCompleto);
    }

    @DeleteMapping("/{id}")
    public void deleteDocente(@PathVariable Integer id) {
        docenteService.deleteDocente(id);
    }

    @PutMapping("/{id}")
    public void updateDocenteNombre(@PathVariable Integer id, @RequestBody String nuevoNombre) {
        docenteService.updateDocenteNombre(id, nuevoNombre);
    }
}
