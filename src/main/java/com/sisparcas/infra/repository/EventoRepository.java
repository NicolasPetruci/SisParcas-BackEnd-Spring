package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
