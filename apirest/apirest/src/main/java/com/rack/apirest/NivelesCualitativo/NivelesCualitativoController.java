package com.rack.apirest.NivelesCualitativo;

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
@RequestMapping("/NivelesCualitativo")
@RequiredArgsConstructor
public class NivelesCualitativoController {

    private final NivelesCualitativoService nivelesCualitativoService;

    @PostMapping
    public void createNivelesCualitativo(@RequestBody NivelesCualitativo nivelesCualitativo) {
        nivelesCualitativoService.createNivelesCualitativo(nivelesCualitativo);
    }

    @GetMapping
    public List<NivelesCualitativo> getAllNivelesCualitativo() {
        return nivelesCualitativoService.getAllNivelesCualitativo();
    }

    @GetMapping("/{id}")
    public NivelesCualitativo getNivelesCualitativoById(@PathVariable Integer id) {
        return nivelesCualitativoService.getNivelesCualitativoById(id).orElse(null);
    }

    @GetMapping("/buscar")
    public List<NivelesCualitativo> getNivelesCualitativoByDescripcion(@RequestParam String descripcionNivel) {
        return nivelesCualitativoService.getNivelesCualitativoByDescripcion(descripcionNivel);
    }

    @DeleteMapping("/{id}")
    public void deleteNivelesCualitativo(@PathVariable Integer id) {
        nivelesCualitativoService.deleteNivelesCualitativo(id);
    }

    @PutMapping("/{id}")
    public void updateNivelesCualitativoDescripcion(@PathVariable Integer id, @RequestBody String nuevaDescripcion) {
        nivelesCualitativoService.updateNivelesCualitativoDescripcion(id, nuevaDescripcion);
    }
}
