package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class Forum implements BaseModel<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private LocalDateTime dataCriacao;

    @ManyToOne
    private Usuario autor;

    @OneToMany
    private List<Post> posts;

    @ManyToMany
    @JoinTable(
            name="forum_assunto",
            joinColumns = @JoinColumn(name="id_forum"),
            inverseJoinColumns = @JoinColumn(name = "id_interesse")
    )
    private List<Interesse> assuntos;

}
