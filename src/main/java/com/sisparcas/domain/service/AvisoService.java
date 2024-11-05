package com.sisparcas.domain.service;


import com.sisparcas.api.dto.AvisoDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Aviso;
import org.springframework.stereotype.Service;

@Service
public class AvisoService extends BaseServiceImpl<Aviso, AvisoDTO, Long> {
}
