package com.sisparcas.domain.service;

import com.sisparcas.api.dto.PostDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService extends BaseServiceImpl<Post, PostDTO, Long> {
}
