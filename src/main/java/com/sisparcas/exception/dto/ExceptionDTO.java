package com.sisparcas.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ExceptionDTO {

    private int status;
    private String message;

}
