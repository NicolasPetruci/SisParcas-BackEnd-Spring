package com.sisparcas.crud.controller.impl;

import com.sisparcas.crud.controller.BaseController;
import com.sisparcas.crud.dto.BaseDTO;
import com.sisparcas.crud.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class BaseControllerImpl<
        D extends BaseDTO<ID>,
        ID extends Serializable>
        implements BaseController<D, ID> {

    @Autowired
    protected BaseService<D, ID> _service;

    @GetMapping
    @Override
    public ResponseEntity<List<D>> getAll() {
        return ResponseEntity.ok().body(_service.getAll());
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<D> getById(@PathVariable ID id) {
        return ResponseEntity.ok().body(_service.getById(id));
    }

    @PostMapping
    @Override
    public ResponseEntity<D> create(@RequestBody D dto) {
        return ResponseEntity.ok().body(_service.create(dto));
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<D> update(@PathVariable ID id, @RequestBody D dto) {
        return ResponseEntity.ok().body(_service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> delete( @PathVariable ID id) {
        _service.delete(id);
        return ResponseEntity.ok().build();
    }
}
