package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.DataComemorativaDTO;
import com.sisparcas.common.converter.LocalDateConverter;
import com.sisparcas.common.converter.LocalDateTimeConverter;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.DataComemorativa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses={LocalDateTimeConverter.class, LocalDateConverter.class})
public abstract class DataComemorativaMapper implements BaseMapper<DataComemorativa, Long, DataComemorativaDTO> {
}
