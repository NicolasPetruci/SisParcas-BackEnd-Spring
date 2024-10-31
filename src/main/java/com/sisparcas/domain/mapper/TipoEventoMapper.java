package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.TipoEventoDTO;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.TipoEvento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TipoEventoMapper implements BaseMapper<TipoEvento, Long, TipoEventoDTO> {
}
