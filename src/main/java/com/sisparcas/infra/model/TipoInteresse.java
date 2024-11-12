package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class TipoInteresse implements BaseModel<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
}
