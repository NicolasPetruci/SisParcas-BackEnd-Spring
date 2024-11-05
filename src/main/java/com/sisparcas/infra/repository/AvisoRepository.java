package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Aviso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisoRepository extends JpaRepository<Aviso, Long> {
}
