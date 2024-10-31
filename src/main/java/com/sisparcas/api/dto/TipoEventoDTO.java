package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.Data;

@Data
public class TipoEventoDTO implements BaseDTO {

    private Long id;
    private String descricao;
}
