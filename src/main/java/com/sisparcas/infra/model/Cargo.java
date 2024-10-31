package com.sisparcas.infra.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Cargo implements BaseModel<Long>, GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name="usuario_cargo",
            joinColumns = @JoinColumn(name="cargo_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private List<Usuario> usuarios;

    @Override
    public String getAuthority() {
        return getDescricao();
    }
}
