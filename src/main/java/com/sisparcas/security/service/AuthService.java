package com.sisparcas.security.service;

import com.sisparcas.api.dto.UsuarioDTO;
import com.sisparcas.domain.mapper.UsuarioMapper;
import com.sisparcas.exception.custom.NotFoundException;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.infra.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AuthService implements UserDetailsService {


    private final UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<Usuario> user =  usuarioRepository.findByEmail(username);
        if(user.isPresent()) {
            return user.get();
        }
        throw new NotFoundException(username);
    }

    public Usuario getLoggedUser() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null) {
            Usuario usuario = (Usuario) authentication.getPrincipal();
            return usuario;
        }
        throw new IllegalArgumentException("Usuario não está logado");
    }

}
