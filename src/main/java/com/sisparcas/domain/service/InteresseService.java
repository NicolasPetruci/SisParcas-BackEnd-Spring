package com.sisparcas.domain.service;

import com.sisparcas.api.dto.InteresseDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Interesse;
import org.springframework.stereotype.Service;

@Service
public class InteresseService extends BaseServiceImpl<Interesse, InteresseDTO, Long> {
}
