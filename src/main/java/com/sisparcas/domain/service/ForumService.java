package com.sisparcas.domain.service;

import com.sisparcas.api.dto.ForumDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Forum;
import org.springframework.stereotype.Service;

@Service
public class ForumService extends BaseServiceImpl<Forum, ForumDTO, Long> {
}
