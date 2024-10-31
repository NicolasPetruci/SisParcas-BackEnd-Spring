package com.sisparcas.api.controller;

import com.sisparcas.api.dto.EventoDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evento")
public class EventoController extends BaseControllerImpl<EventoDTO, Long> {
}
