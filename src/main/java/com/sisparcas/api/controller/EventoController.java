package com.sisparcas.api.controller;

import com.sisparcas.api.dto.EventoDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import com.sisparcas.domain.service.EventoService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Setter(onMethod_ = @__(@Autowired))
@RestController
@RequestMapping("/evento")
public class EventoController extends BaseControllerImpl<EventoDTO, Long> {


    private EventoService eventoService;

    @PutMapping("/inscrever/{idEvento}")
    public EventoDTO inscrever(@PathVariable Long idEvento){
        return eventoService.inscrever(idEvento);
    }

    @PutMapping("/desinscrever/{idEvento}")
    public EventoDTO desinscrever(@PathVariable Long idEvento){
        return eventoService.deinscrever(idEvento);
    }

}
