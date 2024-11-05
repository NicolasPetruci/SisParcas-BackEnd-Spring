package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.AvisoDTO;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Aviso;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AvisoMapper implements BaseMapper<Aviso, Long, AvisoDTO> {
}
