package com.sisparcas.api.controller;


import com.sisparcas.api.dto.MemeDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meme")
public class MemeController extends BaseControllerImpl<MemeDTO, Long> {
}
