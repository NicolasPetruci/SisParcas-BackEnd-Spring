package com.sisparcas.presentation.controller;

import com.sisparcas.crud.controller.impl.BaseControllerImpl;
import com.sisparcas.presentation.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseControllerImpl<UsuarioDTO, Long> {

}
