package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table
@EqualsAndHashCode(of={"id"})
public class GeneroFilme implements BaseModel<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
}
