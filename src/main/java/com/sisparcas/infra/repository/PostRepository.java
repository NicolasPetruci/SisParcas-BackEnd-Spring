package com.sisparcas.infra.repository;

import com.sisparcas.infra.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
