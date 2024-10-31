package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.EventoDTO;
import com.sisparcas.common.converter.LocalDateTimeConverter;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Evento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = LocalDateTimeConverter.class)
public abstract class EventoMapper implements BaseMapper<Evento, Long, EventoDTO> {

}
