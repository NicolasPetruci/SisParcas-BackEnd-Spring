package com.sisparcas.domain.service;

import com.sisparcas.crud.service.impl.BaseServiceImpl;
import com.sisparcas.exception.model.NotFoundException;
import com.sisparcas.presentation.dto.UsuarioDTO;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.infra.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService extends BaseServiceImpl<Usuario, UsuarioDTO, Long> {

    public UsuarioDTO findByEmail(String email) {
        Optional<Usuario> optionalUsuario = ((UsuarioRepository) _repository).findByEmail(email);
        if (optionalUsuario.isPresent()) {
            return _mapper.toDTO(optionalUsuario.get());
        }
        throw new NotFoundException("Usuario com email " + email + " não encontrado.");
    }

    @Override
    public UsuarioDTO create(UsuarioDTO usuarioDTO) {

        return _mapper.toDTO(_repository.save(_mapper.toEntity(usuarioDTO)));
    }
}
