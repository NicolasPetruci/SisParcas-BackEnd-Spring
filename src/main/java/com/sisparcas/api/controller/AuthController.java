package com.sisparcas.api.controller;

import com.sisparcas.api.dto.LoginDTO;
import com.sisparcas.api.dto.TokenDTO;
import com.sisparcas.api.dto.UsuarioDTO;
import com.sisparcas.domain.service.UsuarioService;
import com.sisparcas.exception.custom.TokenValidationException;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.security.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    private final UsuarioService usuarioService;


    @PostMapping("/login")
    public ResponseEntity<TokenDTO> login(@RequestBody LoginDTO loginData) {
        var authToken = new UsernamePasswordAuthenticationToken(loginData.getEmail(), loginData.getSenha());
        var auth = authenticationManager.authenticate(authToken);

        String tkString = tokenService.generateToken((Usuario) auth.getPrincipal());

        TokenDTO token = new TokenDTO(tkString);

        return ResponseEntity.ok(token);
    }

    @GetMapping("/login")
    public ResponseEntity<UsuarioDTO> buscarUsuariLogado(){
        return ResponseEntity.ok(usuarioService.buscarUsuarioLogado());
    }

    @GetMapping({"/token"})
    public ResponseEntity<Void> validateToken(@RequestBody TokenDTO data) {
            String email = tokenService.validateToken(data.getToken());

            if (!email.isEmpty()) {
                return ResponseEntity.ok().build();
            }
            throw new TokenValidationException("Token invalido");
    }
}
