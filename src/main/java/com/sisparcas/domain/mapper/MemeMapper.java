package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.MemeDTO;
import com.sisparcas.common.converter.LocalDateTimeConverter;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Meme;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses={LocalDateTimeConverter.class})
public abstract class MemeMapper implements BaseMapper<Meme, Long, MemeDTO> {
}
