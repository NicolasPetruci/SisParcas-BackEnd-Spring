package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<Meme, Long> {
}
