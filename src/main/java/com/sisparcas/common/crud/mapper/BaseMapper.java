package com.sisparcas.common.crud.mapper;


import com.sisparcas.common.crud.dto.BaseDTO;
import com.sisparcas.common.crud.model.BaseModel;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T extends BaseModel<ID>,
                            ID extends Serializable,
                            D extends BaseDTO
                           > {
    D toDTO(T t);
    T toEntity(D dto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    void toEntityUpdate(D dto, @MappingTarget T t);
    List<D> toDTOList(List<T> entityList);
    List<T> toEntityList(List<D> dtoList);
}
