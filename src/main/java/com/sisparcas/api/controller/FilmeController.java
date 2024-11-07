package com.sisparcas.api.controller;

import com.sisparcas.api.dto.FilmeDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController extends BaseControllerImpl<FilmeDTO, Long> {
}
