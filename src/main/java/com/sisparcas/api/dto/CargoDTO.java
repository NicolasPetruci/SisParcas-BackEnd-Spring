package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.Data;

@Data
public class CargoDTO implements BaseDTO {

    private Long id;

    private String descricao;
}
