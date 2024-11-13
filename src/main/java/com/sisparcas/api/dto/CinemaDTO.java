package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CinemaDTO implements BaseDTO {

    private Long id;

    private String nome;

    private String dataHora;

    private List<FilmeDTO> filmesSorteio;

    private FilmeDTO filmeSelecionado;
}
