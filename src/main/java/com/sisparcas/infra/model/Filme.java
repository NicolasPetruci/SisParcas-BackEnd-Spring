package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Filme implements BaseModel<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToMany()
    @JoinTable(
            name="filme_genero",
            joinColumns = @JoinColumn(name="id_filme"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private List<GeneroFilme> generos;
}
