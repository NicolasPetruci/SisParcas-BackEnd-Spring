package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
