package com.sisparcas.domain.mapper;

import com.sisparcas.crud.mapper.BaseMapper;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.presentation.dto.UsuarioDTO;
import com.sisparcas.security.config.SecurityConfig;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class UsuarioMapper implements BaseMapper<Usuario, Long, UsuarioDTO> {

    @Autowired
    protected SecurityConfig securityConfig;

    @Override
    @Mapping(target = "senha", expression = "java(securityConfig.passwordEncoder().encode(usuarioDTO.getSenha()))")
    public abstract Usuario toEntity(UsuarioDTO usuarioDTO);

}
