package com.sisparcas.domain.service;

import com.sisparcas.api.dto.CinemaDTO;
import com.sisparcas.common.crud.service.impl.BaseServiceImpl;
import com.sisparcas.infra.model.Cinema;
import org.springframework.stereotype.Service;

@Service
public class CinemaService extends BaseServiceImpl<Cinema, CinemaDTO, Long> {
}
