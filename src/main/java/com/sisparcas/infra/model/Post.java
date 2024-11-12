package com.sisparcas.infra.model;


import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity
@Table
@Data
@EqualsAndHashCode(of={"id"})
public class Post implements BaseModel<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String texto;

    private LocalDateTime dataCriacao;

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private Post postPai;

    @ManyToOne
    private Forum forum;

}