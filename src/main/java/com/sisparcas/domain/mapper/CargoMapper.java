package com.sisparcas.domain.mapper;

import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Cargo;
import com.sisparcas.api.dto.CargoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CargoMapper implements BaseMapper<Cargo, Long, CargoDTO> {
}
