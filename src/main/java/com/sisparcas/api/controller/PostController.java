package com.sisparcas.api.controller;

import com.sisparcas.api.dto.PostDTO;
import com.sisparcas.common.crud.controller.impl.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forum/post")
public class PostController extends BaseControllerImpl<PostDTO, Long> {
}
