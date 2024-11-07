package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.GeneroFilmeDTO;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.GeneroFilme;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class GeneroFilmeMapper implements BaseMapper<GeneroFilme, Long, GeneroFilmeDTO> {
}
