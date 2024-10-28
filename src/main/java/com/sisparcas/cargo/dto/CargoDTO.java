package com.sisparcas.cargo.dto;

import com.sisparcas.crud.dto.BaseDTO;
import lombok.Data;

@Data
public class CargoDTO implements BaseDTO<Long> {

    private Long id;

    private String descricao;
}
