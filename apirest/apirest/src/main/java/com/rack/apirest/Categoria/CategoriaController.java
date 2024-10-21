package com.rack.apirest.Categoria;

import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {
    
    private final CategoriaService categoriaService;
    
    @GetMapping()
    public List<CategoriaModel> obtenerCategorias(){
        return categoriaService.obtenerCategorias();
    }

    @PostMapping
    public CategoriaModel guardarCategoria(@RequestBody CategoriaModel categoria){
        return this.categoriaService.guardarCategoria(categoria);
    }

    @GetMapping(path = "/{id}")
    public CategoriaModel obtenerCategoriaPorId(@PathVariable Integer id){
        return categoriaService.obtenerPorId(id);
    }    
}
