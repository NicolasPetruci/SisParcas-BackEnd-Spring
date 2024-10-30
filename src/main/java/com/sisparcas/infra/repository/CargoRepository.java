package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
