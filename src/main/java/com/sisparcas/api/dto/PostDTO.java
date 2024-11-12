package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.Data;

@Data
public class PostDTO implements BaseDTO {


    private Long id;

    private String titulo;

    private String texto;

    private String dataCriacao;

    private UsuarioDTO autor;

    private PostDTO postPai;

    private ForumDTO forum;
}
