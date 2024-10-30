package com.sisparcas.domain.service;

import com.sisparcas.crud.service.impl.BaseServiceImpl;
import com.sisparcas.presentation.dto.CargoDTO;
import com.sisparcas.infra.model.Cargo;
import org.springframework.stereotype.Service;

@Service
public class CargoService extends BaseServiceImpl<Cargo, CargoDTO, Long> {

}
