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
public class MemeDTO implements BaseDTO {
    private Long id;

    private String titulo;

    private String descricao;

    private String tipoMidia;

    private String dataCriacao;

    private UsuarioDTO criador;


}
