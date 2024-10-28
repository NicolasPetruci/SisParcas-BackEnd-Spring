package com.sisparcas.cargo.controller;

import com.sisparcas.crud.controller.impl.BaseControllerImpl;
import com.sisparcas.cargo.dto.CargoDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargo")
public class CargoController extends BaseControllerImpl<CargoDTO, Long> {

}
