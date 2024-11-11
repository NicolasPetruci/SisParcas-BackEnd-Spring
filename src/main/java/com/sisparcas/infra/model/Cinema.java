package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;


@Data
@EqualsAndHashCode(of="id")
@Table
@Entity
public class Cinema implements BaseModel<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    @ManyToMany
    @JoinTable(
            name="filme_sorteio",
            joinColumns = @JoinColumn(name="id_cinema"),
            inverseJoinColumns = @JoinColumn(name = "id_filme")
    )
    private List<Filme> filmesSorteio;

    @ManyToOne
    private Filme filmeSelecionado;

}
