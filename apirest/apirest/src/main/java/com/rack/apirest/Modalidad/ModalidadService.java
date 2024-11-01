package com.rack.apirest.Modalidad;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModalidadService {
    
    private final ModalidadRepository modalidadRepo;
    
    public ModalidadModel createModalidad(ModalidadModel modalidad){
        return modalidadRepo.save(modalidad);
    }

    public List<ModalidadModel> getAllModalidades(){
        return modalidadRepo.findByIsDeleted(0);
    }

    public Optional<ModalidadModel> getModalidadById(int modalidadId){
        return modalidadRepo.findByModalidadIdAndIsDeleted(modalidadId, 0);
    }

    public List<ModalidadModel> getModalidadesByNombre(String descripcion){
        return modalidadRepo.findByDescripcionAndIsDeleted(descripcion, 0);
    }

    @Transactional
    public void deleteModalidad(Integer modalidadId) {
        modalidadRepo.findById(modalidadId).ifPresent(modalidad -> {
            modalidad.setIsDeleted(1);
            modalidadRepo.save(modalidad);
        });
    }

    @Transactional
    public void updateModalidadDescripcion(Integer modalidadId, String nuevaDescripcion) {
        modalidadRepo.findById(modalidadId).ifPresent(modalidad -> {
            modalidad.setDescripcion(nuevaDescripcion);
            modalidadRepo.save(modalidad);
        });
    }
}
