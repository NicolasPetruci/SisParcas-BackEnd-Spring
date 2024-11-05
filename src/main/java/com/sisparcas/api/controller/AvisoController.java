package com.sisparcas.api.controller;

import com.sisparcas.api.dto.AvisoDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avisos")
public class AvisoController extends BaseControllerImpl<AvisoDTO, Long> {
}
