package com.sisparcas.common.optional;

import com.sisparcas.exception.custom.NotFoundException;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.Optional;

@Component
public class OptionalUtils {

    public <T> T getOrElseThrow(Optional<T> optional) {
             return optional.orElseThrow(()-> new NotFoundException(
                     "Objeto do tipo: " +
                             ((Class<?>) ((ParameterizedType) optional
                                     .getClass()
                                     .getGenericSuperclass())
                                     .getActualTypeArguments()[0])
                                     .getTypeName() +
                     "Não encontrado"
                     )
             );
    }

}
