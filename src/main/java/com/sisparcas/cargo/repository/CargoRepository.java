package com.sisparcas.cargo.repository;

import com.sisparcas.cargo.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
