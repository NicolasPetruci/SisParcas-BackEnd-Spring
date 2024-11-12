package com.sisparcas.domain.service;

import com.sisparcas.api.dto.EventoDTO;
import com.sisparcas.common.optional.OptionalUtils;
import com.sisparcas.domain.mapper.EventoMapper;
import com.sisparcas.infra.model.Evento;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.infra.repository.EventoRepository;
import com.sisparcas.security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class InscricaoEventoService {

    private final EventoMapper _mapper;
    private final EventoRepository _repository;
    private final AuthService authService;
    private final OptionalUtils optionalUtils;

    public EventoDTO inscrever(Long idEvento){
        Evento evento = optionalUtils.getOrElseThrow(_repository.findById(idEvento));
        Usuario usuarioLogado = authService.getLoggedUser();
        if(!isParticipanteInscrito(evento, usuarioLogado)) {
            evento.getParticipantes().add(usuarioLogado);
            _repository.save(evento);
        }
        return _mapper.toDTO(evento);
    }


    public EventoDTO deinscrever(Long idEvento){
        Evento evento = optionalUtils.getOrElseThrow(_repository.findById(idEvento));
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
