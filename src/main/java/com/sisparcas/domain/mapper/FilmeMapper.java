package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.FilmeDTO;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Filme;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class FilmeMapper implements BaseMapper<Filme, Long, FilmeDTO> {
}
