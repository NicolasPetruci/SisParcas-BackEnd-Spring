package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@Data
@NoArgsConstructor
public class DataComemorativa implements BaseModel<Long> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String titulo;

    private String descricao;

    private LocalDateTime dataCriacao;

    private LocalDate data;

    @ManyToOne
    private Usuario criador;

}
