package com.sisparcas.domain.service;

import com.sisparcas.api.dto.EventoDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Evento;
import org.springframework.stereotype.Service;

@Service
public class EventoService extends BaseServiceImpl<Evento, EventoDTO, Long> {

}
