package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.TipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEventoRepository extends JpaRepository<TipoEvento, Long> {
}
