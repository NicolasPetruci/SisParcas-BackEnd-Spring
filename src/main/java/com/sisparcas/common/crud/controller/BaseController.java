package com.sisparcas.common.crud.controller;

import com.sisparcas.common.crud.dto.BaseDTO;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;


public interface BaseController<
        D extends BaseDTO,
        ID extends Serializable
        > {

    ResponseEntity<List<D>> getAll();
    ResponseEntity<D> getById(ID id);
    ResponseEntity<D> create(D dto);
    ResponseEntity<D> update(ID id, D dto);
    ResponseEntity<Void> delete(ID id);

}