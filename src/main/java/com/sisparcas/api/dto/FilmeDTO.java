package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmeDTO implements BaseDTO {

    private Long id;
    private String nome;
    private List<GeneroFilmeDTO> generos;
}
