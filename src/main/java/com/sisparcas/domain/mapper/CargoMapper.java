package com.sisparcas.domain.mapper;

import com.sisparcas.crud.mapper.BaseMapper;
import com.sisparcas.presentation.dto.CargoDTO;
import com.sisparcas.infra.model.Cargo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CargoMapper implements BaseMapper<Cargo, Long, CargoDTO> {
}
