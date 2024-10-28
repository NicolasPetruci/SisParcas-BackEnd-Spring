package com.sisparcas.crud.service;

import com.sisparcas.crud.dto.BaseDTO;

import java.io.Serializable;
import java.util.List;

public interface BaseService<D extends BaseDTO<ID>, ID extends Serializable> {

    List<D> getAll();
    D getById(ID id);
    D create(D dto);
    D update(ID id, D dto);
    void delete(ID id);

}
