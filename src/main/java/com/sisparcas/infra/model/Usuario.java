package com.sisparcas.infra.model;

import com.sisparcas.common.crud.model.BaseModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of={"id"})
@Entity
@Table
public class Usuario implements BaseModel<Long>, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo 'nome' não pode estar vazio/nulo.")
    @Length(min = 2, max = 255, message = "O campo 'nome' possuir no mínimo {min} caracteres e no máximo {max}.")
    private String nome;

    @NotBlank(message = "O campo 'email' não pode estar vazio/nulo.")
    @Email(message = "O campo 'email' deve possuir um email válido")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "O campo 'senha' não pode estar vazio/nulo.")
    private String senha;

    private String telefone;

    @NotNull(message = "O campo 'aniversario' não pode estar nulo/vazio")
    @Past(message = "O campo 'aniversario' deve estar no passado.")
    private LocalDate aniversario;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="usuario_cargo",
            joinColumns = @JoinColumn(name="usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "cargo_id")
    )
    private List<Cargo> cargos;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="usuario_interesse",
            joinColumns = @JoinColumn(name="id_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_interesse")
    )
    private List<Interesse> interesses;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getCargos();
    }

    @Override
    public String getPassword() {
        return getSenha();
    }

    @Override
    public String getUsername() {
        return getEmail();
    }
}
