package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import com.sisparcas.infra.model.TipoEvento;
import lombok.Data;

import java.util.List;

@Data
public class EventoDTO implements BaseDTO {

    private Long id;

    private String nome;

    private String descricao;

    private String local;

    private Boolean online;

    private String dataHora;

    private TipoEvento tipo;

    private List<UsuarioDTO> participantes;
}
