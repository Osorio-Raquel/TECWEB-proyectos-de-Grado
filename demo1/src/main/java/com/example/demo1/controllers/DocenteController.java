package com.example.demo1.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo1.models.DocenteModel;
import com.example.demo1.services.DocenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docente")
public class DocenteController {
    @Autowired
    private DocenteService docenteService;

    @GetMapping()
    public ArrayList<DocenteModel> obtenerDocentes() {
        return docenteService.obtenerDocentes();
    }

    @PostMapping()
    public DocenteModel guardarDocente(@RequestBody DocenteModel docente) {
        return this.docenteService.guardarDocente(docente);
    }

    @GetMapping(path = "/{id}")
    public Optional<DocenteModel> obtenerDocentePorId(@PathVariable("id") Long id) {
        return this.docenteService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.docenteService.eliminarDocente(id);
        if (ok) {
            return "Se eliminó el docente con id " + id;
        } else {
            return "No pudo eliminar el docente con id " + id;
        }
    }
}
