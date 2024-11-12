package com.sisparcas.api.controller;

import com.sisparcas.api.dto.CinemaDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import com.sisparcas.domain.service.SorteioCinemaService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cinema")
@Setter(onMethod_ = @__(@Autowired))
public class CinemaController extends BaseControllerImpl<CinemaDTO, Long> {

    private SorteioCinemaService _sorteioCinemaService;

    @PutMapping("/{idCinema}/adicionar-filme/{idFilme}")
    public ResponseEntity<CinemaDTO> adicionarFilmeSorteio(@PathVariable Long idCinema, @PathVariable Long idFilme) {
        return ResponseEntity.ok(_sorteioCinemaService.adicionarFilmeSorteio(idCinema, idFilme));
    }

    @PutMapping("/{idCinema}/remover-filme/{idFilme}")
    public ResponseEntity<CinemaDTO> removerFilmeSorteio(@PathVariable Long idCinema, @PathVariable Long idFilme) {
        return ResponseEntity.ok(_sorteioCinemaService.removerFilmeSorteio(idCinema, idFilme));
    }
    
    @PutMapping("/{idCinema}/sortear") 
    public ResponseEntity<CinemaDTO> sortearFilme(@PathVariable Long idCinema) {
        return ResponseEntity.ok(_sorteioCinemaService.sortearFilme(idCinema));
    }

}
