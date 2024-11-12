package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.PostDTO;
import com.sisparcas.common.converter.LocalDateTimeConverter;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses={LocalDateTimeConverter.class})
public abstract class PostMapper implements BaseMapper<Post, Long, PostDTO> {
}
