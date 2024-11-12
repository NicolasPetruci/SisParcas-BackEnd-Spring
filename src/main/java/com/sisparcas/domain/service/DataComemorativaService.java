package com.sisparcas.domain.service;

import com.sisparcas.api.dto.DataComemorativaDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.DataComemorativa;
import org.springframework.stereotype.Service;

@Service
public class DataComemorativaService extends BaseServiceImpl<DataComemorativa, DataComemorativaDTO, Long> {
}
