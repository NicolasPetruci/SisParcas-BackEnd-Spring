package com.sisparcas.security.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.sisparcas.exception.custom.TokenGenerationException;
import com.sisparcas.exception.custom.TokenValidationException;
import com.sisparcas.infra.model.Usuario;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    private final String SECRET = "SECRET_KEY";


    private Instant expirationToken() {
        return LocalDateTime.now().plusHours(96).toInstant(ZoneOffset.of("-03:00"));
    }

    public String generateToken(Usuario user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            return JWT.create()
                    .withIssuer("sisparcas")
                    .withSubject(user.getEmail())
                    .withExpiresAt(expirationToken())
                    .withClaim("id", user.getId())
                    .withClaim("cargos", user.getCargos().stream().map(c->c.getDescricao().toUpperCase()).toList())
                    .sign(algorithm);
        } catch (JWTCreationException e) {
            throw new TokenGenerationException("Erro ao gerar o token: " + e.getMessage());
        }
    }

    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            return JWT.require(algorithm)
                    .withIssuer("sisparcas")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            throw new TokenValidationException("Erro ao validar o token: " + e.getMessage());
        }
    }

}
