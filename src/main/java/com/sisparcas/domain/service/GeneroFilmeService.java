package com.sisparcas.domain.service;


import com.sisparcas.api.dto.GeneroFilmeDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.GeneroFilme;
import org.springframework.stereotype.Service;

@Service
public class GeneroFilmeService extends BaseServiceImpl<GeneroFilme, GeneroFilmeDTO, Long> {
}
