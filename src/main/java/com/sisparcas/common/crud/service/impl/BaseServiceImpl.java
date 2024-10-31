package com.sisparcas.common.crud.service.impl;

import com.sisparcas.common.crud.dto.BaseDTO;
import com.sisparcas.common.crud.mapper.BaseMapper;
import com.sisparcas.common.crud.model.BaseModel;
import com.sisparcas.common.crud.service.BaseService;
import com.sisparcas.exception.custom.NotFoundException;
import jakarta.transaction.Transactional;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

@Setter(onMethod_ = @__(@Autowired))
public class BaseServiceImpl<
                             T extends BaseModel<ID>,
                             D extends BaseDTO,
                             ID extends Serializable
                            > implements BaseService<D, ID> {


    protected JpaRepository<T, ID> _repository;

    protected BaseMapper<T, ID, D> _mapper;

    @Override
    public List<D> getAll() {
        return this._mapper.toDTOList(
                this._repository.findAll()
        );
    }

    @Override
    public D getById(ID id) {
        return this._mapper.toDTO(
                this._repository.findById(id)
                        .orElseThrow(()->new NotFoundException("Objeto com id: "+id+" não encontrado"))
        );
    }

    @Transactional
    @Override
    public void delete(ID id) {
        this._repository.deleteById(id);
    }

    @Transactional
    @Override
    public D update(ID id, D dto) {
        Optional<T> entityOptional = this._repository.findById(id);
        if (entityOptional.isPresent()) {
            T entity = entityOptional.get();
            this._mapper.toEntityUpdate(dto, entity);
            return this._mapper.toDTO(
                    this._repository.save(entity)
            );
        }
        throw new NotFoundException("Objeto do tipo " + ((Class<?>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName() + " não encontrado");
    }

    @Transactional
    @Override
    public D create(D dto) {
        T entity = this._mapper.toEntity(dto);
        return this._mapper.toDTO(
                this._repository.save(entity)
        );
    }
}
