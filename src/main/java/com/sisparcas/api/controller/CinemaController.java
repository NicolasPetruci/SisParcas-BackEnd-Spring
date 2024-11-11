package com.sisparcas.api.controller;

import com.sisparcas.api.dto.CinemaDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cinema")
public class CinemaController extends BaseControllerImpl<CinemaDTO, Long> {
}
