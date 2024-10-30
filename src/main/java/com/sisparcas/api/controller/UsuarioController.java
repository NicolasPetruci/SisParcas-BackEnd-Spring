package com.sisparcas.api.controller;

import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import com.sisparcas.api.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseControllerImpl<UsuarioDTO, Long> {

}
