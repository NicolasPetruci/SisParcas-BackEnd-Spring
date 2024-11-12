package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataComemorativaDTO implements BaseDTO {

    private Long id;

    private String titulo;

    private String descricao;

    private String dataCriacao;

    private String data;

    private UsuarioDTO criador;
}
