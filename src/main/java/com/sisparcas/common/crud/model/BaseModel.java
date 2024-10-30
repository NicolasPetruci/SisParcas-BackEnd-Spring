package com.sisparcas.common.crud.model;

import java.io.Serializable;


public interface BaseModel<ID extends Serializable> {
    ID getId();
    void setId(ID id);
}
