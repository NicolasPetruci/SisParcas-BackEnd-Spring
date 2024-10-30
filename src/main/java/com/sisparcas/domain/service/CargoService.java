package com.sisparcas.domain.service;

import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Cargo;
import com.sisparcas.api.dto.CargoDTO;
import org.springframework.stereotype.Service;

@Service
public class CargoService extends BaseServiceImpl<Cargo, CargoDTO, Long> {

}
