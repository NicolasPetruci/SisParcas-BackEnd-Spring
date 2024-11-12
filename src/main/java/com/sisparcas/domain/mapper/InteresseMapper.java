package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.InteresseDTO;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Interesse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class InteresseMapper implements BaseMapper<Interesse, Long, InteresseDTO> {
}
