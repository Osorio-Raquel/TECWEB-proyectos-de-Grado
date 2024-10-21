package com.rack.apirest.Categoria;

import java.util.List; 
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    
    private final CategoriaRepository categoriaRepo;
    
    public List<CategoriaModel> obtenerCategorias(){
        return (List<CategoriaModel>) categoriaRepo.findAll();
    }

    public CategoriaModel guardarCategoria(CategoriaModel categoria){
        return categoriaRepo.save(categoria);
    }

    public CategoriaModel obtenerPorId(int id){
        return categoriaRepo.findById(id).orElse(null);
    }
}