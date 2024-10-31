package com.sisparcas.api.controller;

import com.sisparcas.api.dto.TipoEventoDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evento/tipo")
public class TipoEventoController extends BaseControllerImpl<TipoEventoDTO, Long> {

}
