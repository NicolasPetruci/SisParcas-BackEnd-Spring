package com.sisparcas.common.crud.controller.impl;

import com.sisparcas.common.crud.controller.BaseController;
import com.sisparcas.common.crud.dto.BaseDTO;
import com.sisparcas.common.crud.service.BaseService;
import jakarta.validation.Valid;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@Setter(onMethod = @__(@Autowired))
public class BaseControllerImpl<
        D extends BaseDTO,
        ID extends Serializable>
        implements BaseController<D, ID> {

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
    public ResponseEntity<D> create(@Valid @RequestBody D dto) {
        return ResponseEntity.ok().body(_service.create(dto));
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<D> update(@PathVariable ID id, @Valid @RequestBody D dto) {
        return ResponseEntity.ok().body(_service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> delete( @PathVariable ID id) {
        _service.delete(id);
        return ResponseEntity.ok().build();
    }
}
