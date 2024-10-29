package com.sisparcas.crud.mapper;


import com.sisparcas.crud.dto.BaseDTO;
import com.sisparcas.crud.model.BaseModel;

import java.io.Serializable;
import java.util.List;


public interface BaseMapper<T extends BaseModel<ID>,
                            ID extends Serializable,
                            D extends BaseDTO
                           > {
    D toDTO(T t);
    T toEntity(D dto);
    List<D> toDTOList(List<T> entityList);
    List<T> toEntityList(List<D> dtoList);
}
