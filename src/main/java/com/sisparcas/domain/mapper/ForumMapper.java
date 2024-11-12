package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.ForumDTO;
import com.sisparcas.common.converter.LocalDateTimeConverter;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Forum;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {LocalDateTimeConverter.class})
public abstract class ForumMapper implements BaseMapper<Forum, Long, ForumDTO> {
}
