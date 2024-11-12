package com.sisparcas.api.dto;

import com.sisparcas.common.crud.dto.BaseDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UsuarioDTO implements BaseDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate aniversario;
    private String senha;
    private List<CargoDTO> cargos;
    private List<InteresseDTO> interesses;
}
