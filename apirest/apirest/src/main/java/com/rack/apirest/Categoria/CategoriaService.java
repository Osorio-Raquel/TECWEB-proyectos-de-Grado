package com.rack.apirest.Categoria;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    
    private final CategoriaRepository categoriaRepo;
    
    public CategoriaModel createCategoria(CategoriaModel categoria){
        return categoriaRepo.save(categoria);
    }

    public List<CategoriaModel> getAllCategorias(){
        return categoriaRepo.findByIsDeleted(0);
    }

    public Optional<CategoriaModel> getCategoriaById(int categoriaId){
        return categoriaRepo.findByCategoriaIdAndIsDeleted(categoriaId, 0);
    }

    public List<CategoriaModel> getCategoriasByNombre(String nombre){
        return categoriaRepo.findByNombreAndIsDeleted(nombre, 0);
    }

    @Transactional
    public void deleteCategoria(Integer categoriaId) {
        categoriaRepo.findById(categoriaId).ifPresent(categoria -> {
            categoria.setIsDeleted(1);
            categoriaRepo.save(categoria);
        });
    }

    @Transactional
    public void updateCategoriaNombre(Integer categoriaId, String nuevoNombre) {
        categoriaRepo.findById(categoriaId).ifPresent(categoria -> {
            categoria.setNombre(nuevoNombre);
            categoriaRepo.save(categoria);
        });
    }
}