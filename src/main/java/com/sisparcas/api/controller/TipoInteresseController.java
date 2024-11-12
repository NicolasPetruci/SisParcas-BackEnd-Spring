package com.sisparcas.api.controller;

import com.sisparcas.api.dto.TipoInteresseDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interesse/tipo")
public class TipoInteresseController extends BaseControllerImpl<TipoInteresseDTO, Long> {
}
