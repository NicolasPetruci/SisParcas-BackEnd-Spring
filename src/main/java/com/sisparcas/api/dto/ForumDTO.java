package com.sisparcas.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.Data;

import java.util.List;


@Data
public class ForumDTO implements BaseDTO {

    private Long id;

    private String titulo;

    private String descricao;

    private UsuarioDTO autor;

    private String dataCriacao;

    @JsonIgnore
    private List<PostDTO> posts;

    private List<InteresseDTO> assuntos;
}
