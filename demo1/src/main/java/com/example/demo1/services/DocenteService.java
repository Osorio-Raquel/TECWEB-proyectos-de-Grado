package com.example.demo1.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo1.models.DocenteModel;
import com.example.demo1.repositories.DocenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteService {
    @Autowired
    private DocenteRepository docenteRepository;

    public ArrayList<DocenteModel> obtenerDocentes() {
        return (ArrayList<DocenteModel>) docenteRepository.findAll();
    }

    public DocenteModel guardarDocente(DocenteModel docente) {
        return docenteRepository.save(docente);
    }

    public Optional<DocenteModel> obtenerPorId(Long id) {
        return docenteRepository.findById(id);
    }

    public boolean eliminarDocente(Long id) {
        try {
            docenteRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

