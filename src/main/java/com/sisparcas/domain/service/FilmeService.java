package com.sisparcas.domain.service;

import com.sisparcas.api.dto.FilmeDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Filme;
import org.springframework.stereotype.Service;

@Service
public class FilmeService extends BaseServiceImpl<Filme, FilmeDTO, Long> {
}
