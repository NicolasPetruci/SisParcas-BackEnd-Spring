package com.sisparcas.cargo.mapper;

import com.sisparcas.crud.mapper.BaseMapper;
import com.sisparcas.cargo.dto.CargoDTO;
import com.sisparcas.cargo.model.Cargo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface CargoMapper extends BaseMapper<Cargo, Long, CargoDTO> {
}
