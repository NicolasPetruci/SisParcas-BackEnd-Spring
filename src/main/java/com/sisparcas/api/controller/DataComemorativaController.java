package com.sisparcas.api.controller;

import com.sisparcas.api.dto.DataComemorativaDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-comemorativa")
public class DataComemorativaController extends BaseControllerImpl<DataComemorativaDTO, Long> {
}
