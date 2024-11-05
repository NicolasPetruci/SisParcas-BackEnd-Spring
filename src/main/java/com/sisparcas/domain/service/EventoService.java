package com.sisparcas.domain.service;

import com.sisparcas.api.dto.EventoDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.exception.custom.NotFoundException;
import com.sisparcas.infra.model.Evento;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.security.service.AuthService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Setter(onMethod_ = @__(@Autowired))
@Service
public class EventoService extends BaseServiceImpl<Evento, EventoDTO, Long> {

    private AuthService authService;

    public EventoDTO inscrever(Long idEvento){
        Optional<Evento> eventoSelecionado = _repository.findById(idEvento);
        if(eventoSelecionado.isEmpty()){
            throw new NotFoundException("O evento com id: "+ idEvento+ " não foi encontrado.");
        }
        Evento evento = eventoSelecionado.get();
        Usuario usuarioLogado = authService.getLoggedUser();
        if(!isParticipanteInscrito(evento, usuarioLogado)) {
            evento.getParticipantes().add(usuarioLogado);
            _repository.save(evento);
        }
        return _mapper.toDTO(evento);
    }


    public EventoDTO deinscrever(Long idEvento){
        Optional<Evento> eventoSelecionado = _repository.findById(idEvento);
        if(eventoSelecionado.isEmpty()){
            throw new NotFoundException("O evento com id: "+ idEvento+ " não foi encontrado.");
        }
        Evento evento = eventoSelecionado.get();
        Usuario usuarioLogado = authService.getLoggedUser();
        if(isParticipanteInscrito(evento, usuarioLogado)) {
            evento.getParticipantes().remove(usuarioLogado);
            evento = _repository.save(evento);
        }
        return _mapper.toDTO(evento);
    }

    private Boolean isParticipanteInscrito(Evento evento, Usuario usuario){
        return evento.getParticipantes().contains(usuario);
    }
}
