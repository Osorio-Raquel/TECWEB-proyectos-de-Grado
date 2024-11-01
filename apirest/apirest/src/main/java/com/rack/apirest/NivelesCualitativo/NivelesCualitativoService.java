package com.rack.apirest.NivelesCualitativo;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class NivelesCualitativoService {

    private final NivelesCualitativoRepository nivelesCualitativoRepo;

    public void createNivelesCualitativo(NivelesCualitativo nivelesCualitativo) {
        nivelesCualitativoRepo.save(nivelesCualitativo);
    }

    public List<NivelesCualitativo> getAllNivelesCualitativo() {
        return nivelesCualitativoRepo.findByIsDeleted(0);
    }

    public Optional<NivelesCualitativo> getNivelesCualitativoById(Integer puntajeCualitativoID) {
        return nivelesCualitativoRepo.findByPuntajeCualitativoIDAndIsDeleted(puntajeCualitativoID, 0);
    }

    public List<NivelesCualitativo> getNivelesCualitativoByDescripcion(String descripcionNivel) {
        return nivelesCualitativoRepo.findByDescripcionNivelAndIsDeleted(descripcionNivel, 0);
    }

    @Transactional
    public void deleteNivelesCualitativo(Integer puntajeCualitativoID) {
        nivelesCualitativoRepo.findById(puntajeCualitativoID).ifPresent(nivel -> {
            nivel.setIsDeleted(1);
            nivelesCualitativoRepo.save(nivel);
        });
    }

    @Transactional
    public void updateNivelesCualitativoDescripcion(Integer puntajeCualitativoID, String nuevaDescripcion) {
        nivelesCualitativoRepo.findById(puntajeCualitativoID).ifPresent(nivel -> {
            nivel.setDescripcionNivel(nuevaDescripcion);
            nivelesCualitativoRepo.save(nivel);
        });
    }
}
