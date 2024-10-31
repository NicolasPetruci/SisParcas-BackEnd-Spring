package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Evento implements BaseModel<Long> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;

    private String descricao;

    private String local;

    private Boolean online;

    private LocalDateTime dataHora;

    @ManyToOne
    private TipoEvento tipo;

    @ManyToMany
    @JoinTable(
            name = "participante_evento",
            joinColumns = @JoinColumn(name="evento_id"),
            inverseJoinColumns = @JoinColumn(name="participante_id")
    )
    private List<Usuario> participantes;

}
