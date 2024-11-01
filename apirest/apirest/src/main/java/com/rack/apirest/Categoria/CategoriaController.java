package com.rack.apirest.Categoria;

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
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {
    
    private final CategoriaService categoriaService;
    
    @PostMapping
    public CategoriaModel createCategoria(@RequestBody CategoriaModel categoria){
        return this.categoriaService.createCategoria(categoria);
    }  

    @GetMapping()
    public List<CategoriaModel> getAllCategorias(){
        return categoriaService.getAllCategorias();
    }

    @GetMapping(path = "/{id}")
    public CategoriaModel getCategoriaById(@PathVariable Integer id){
        return categoriaService.getCategoriaById(id).orElse(null);
    } 

    @GetMapping("/buscar")
    public List<CategoriaModel> getCategoriasByNombre(@RequestParam String nombre) {
        return categoriaService.getCategoriasByNombre(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCategoria(@PathVariable Integer id){
        categoriaService.deleteCategoria(id);
    }

    @PutMapping("/{id}")
    public void updateCategoriaNombre(@PathVariable Integer id, @RequestBody String nuevoNombre) {
        categoriaService.updateCategoriaNombre(id, nuevoNombre);
    }
}
