package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.DataComemorativa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataComemorativaRepository extends JpaRepository<DataComemorativa, Long> {
}
