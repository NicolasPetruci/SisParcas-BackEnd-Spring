package com.sisparcas.api.controller;

import com.sisparcas.api.dto.GeneroFilmeDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import com.sisparcas.infra.model.GeneroFilme;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme/genero")
public class GeneroFilmeController extends BaseControllerImpl<GeneroFilmeDTO, Long> {
}
