package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.*;

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
