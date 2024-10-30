package com.sisparcas.presentation.dto;

import com.sisparcas.crud.dto.BaseDTO;
import lombok.Data;

@Data
public class CargoDTO implements BaseDTO {

    private Long id;

    private String descricao;
}
