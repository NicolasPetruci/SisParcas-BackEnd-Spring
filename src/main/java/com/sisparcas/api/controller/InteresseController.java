package com.sisparcas.api.controller;

import com.sisparcas.api.dto.InteresseDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interesse")
public class InteresseController extends BaseControllerImpl<InteresseDTO, Long> {
}
