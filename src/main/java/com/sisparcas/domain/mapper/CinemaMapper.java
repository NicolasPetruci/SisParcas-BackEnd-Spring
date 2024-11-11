package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.CinemaDTO;
import com.sisparcas.common.converter.LocalDateTimeConverter;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Cinema;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = LocalDateTimeConverter.class)
public abstract class CinemaMapper implements BaseMapper<Cinema, Long, CinemaDTO> {
}
