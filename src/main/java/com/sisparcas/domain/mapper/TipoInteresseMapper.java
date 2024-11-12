package com.sisparcas.domain.mapper;


import com.sisparcas.api.dto.TipoInteresseDTO;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.TipoInteresse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TipoInteresseMapper implements BaseMapper<TipoInteresse, Long, TipoInteresseDTO> {
}
