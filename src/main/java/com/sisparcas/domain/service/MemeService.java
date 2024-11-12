package com.sisparcas.domain.service;

import com.sisparcas.api.dto.MemeDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Meme;
import org.springframework.stereotype.Service;

@Service
public class MemeService extends BaseServiceImpl<Meme, MemeDTO, Long> {
}
