package com.sisparcas.api.controller;

import com.sisparcas.api.dto.LoginDTO;
import com.sisparcas.api.dto.TokenDTO;
import com.sisparcas.api.dto.UsuarioDTO;
import com.sisparcas.exception.custom.NotFoundException;
import com.sisparcas.exception.custom.TokenValidationException;
import com.sisparcas.infra.model.Usuario;
import com.sisparcas.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;


    @PostMapping("/login")
    public ResponseEntity<TokenDTO> login(@RequestBody LoginDTO loginData) {
        var authToken = new UsernamePasswordAuthenticationToken(loginData.getEmail(), loginData.getSenha());
        var auth = authenticationManager.authenticate(authToken);

        String tkString = tokenService.generateToken((Usuario) auth.getPrincipal());

        TokenDTO token = new TokenDTO(tkString);

        return ResponseEntity.ok(token);
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
