package com.rack.apirest.Modalidad;

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
@RequestMapping("/modalidad")
@RequiredArgsConstructor
public class ModalidadController {
    
    private final ModalidadService modalidadService;
    
    @PostMapping
    public ModalidadModel createModalidad(@RequestBody ModalidadModel modalidad){
        return this.modalidadService.createModalidad(modalidad);
    }  

    @GetMapping()
    public List<ModalidadModel> getAllmodalidades(){
        return modalidadService.getAllModalidades();
    }

    @GetMapping(path = "/{id}")
    public ModalidadModel getModalidadById(@PathVariable Integer id){
        return modalidadService.getModalidadById(id).orElse(null);
    } 

    @GetMapping("/buscar")
    public List<ModalidadModel> getModalidadesByNombre(@RequestParam String descripcion) {
        return modalidadService.getModalidadesByNombre(descripcion);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteModalidad(@PathVariable Integer id){
        modalidadService.deleteModalidad(id);
    }

    @PutMapping("/{id}")
    public void updateModalidadDescripcion(@PathVariable Integer id, @RequestBody String nuevaDescripcion) {
        modalidadService.updateModalidadDescripcion(id, nuevaDescripcion);
    }
}
