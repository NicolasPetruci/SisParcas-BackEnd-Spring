package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Forum, Long> {
}
