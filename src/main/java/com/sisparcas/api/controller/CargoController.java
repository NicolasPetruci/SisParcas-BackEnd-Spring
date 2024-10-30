package com.sisparcas.api.controller;

import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import com.sisparcas.api.dto.CargoDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargo")
public class CargoController extends BaseControllerImpl<CargoDTO, Long> {

}
