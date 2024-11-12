package com.sisparcas.api.controller;

import com.sisparcas.api.dto.ForumDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forum")
public class ForumController extends BaseControllerImpl<ForumDTO, Long> {
}
