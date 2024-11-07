package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
