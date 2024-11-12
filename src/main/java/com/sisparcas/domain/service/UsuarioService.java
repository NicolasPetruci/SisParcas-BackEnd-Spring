package com.sisparcas.domain.service;

import com.sisparcas.api.dto.UsuarioDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.exception.custom.NotFoundException;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.infra.repository.UsuarioRepository;
import com.sisparcas.security.service.AuthService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Setter(onMethod_ = @__(@Autowired))
@Service
public class UsuarioService extends BaseServiceImpl<Usuario, UsuarioDTO, Long> {

    private AuthService authService;

    public UsuarioService(AuthService authService) {
        super();
        this.authService = authService;
    }

    public UsuarioDTO findByEmail(String email) {
        Optional<Usuario> optionalUsuario = ((UsuarioRepository) _repository).findByEmail(email);
        if (optionalUsuario.isPresent()) {
            return _mapper.toDTO(optionalUsuario.get());
        }
        throw new NotFoundException("Usuario com email " + email + " não encontrado.");
    }


    public UsuarioDTO buscarUsuarioLogado(){
        return _mapper.toDTO(authService.getLoggedUser());
    }

    public List<String> buscarCargosUsuarioLogado(){
        Usuario usuario = authService.getLoggedUser();
        return usuario.getCargos().stream().map(c->c.getDescricao().toUpperCase()).toList();
    }

    @Override
    public UsuarioDTO create(UsuarioDTO usuarioDTO) {

        return _mapper.toDTO(_repository.save(_mapper.toEntity(usuarioDTO)));
    }
}
