package com.sisparcas.domain.mapper;

import com.sisparcas.api.dto.UsuarioDTO;
import com.sisparcas.common.converter.LocalDateConverter;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.security.config.SecurityConfig;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = LocalDateConverter.class)
@Setter(onMethod = @__(@Autowired))
public abstract class UsuarioMapper implements BaseMapper<Usuario, Long, UsuarioDTO> {

    protected SecurityConfig securityConfig;

    @Override
    @Mapping(target = "senha", expression = "java(securityConfig.passwordEncoder().encode(usuarioDTO.getSenha()))")
    public abstract Usuario toEntity(UsuarioDTO usuarioDTO);

}
