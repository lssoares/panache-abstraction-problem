package org.acme.base;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * @author leandrosoares
 */
public abstract class AbstractBaseLongRepository<T extends AbstractBaseLongEntity>
        implements PanacheRepositoryBase<T, Long> {

    protected Class<T> clazz;

    public AbstractBaseLongRepository() {

        Type genericSuperClass = getClass().getGenericSuperclass();

        ParameterizedType parametrizedType = null;
        while (parametrizedType == null) {
            if ((genericSuperClass instanceof ParameterizedType)) {
                parametrizedType = (ParameterizedType) genericSuperClass;
            } else {
                genericSuperClass = ((Class<?>) genericSuperClass).getGenericSuperclass();
            }
        }

        this.clazz = (Class<T>) parametrizedType.getActualTypeArguments()[0];

    }


    /**
     * This method is here to give to check that it is not really called although the @override instruction.
     * @return
     */
    @Override
    public List<T> listAll() {
        return Collections.emptyList();
    }


    public List<T> listEmpty() {
        return Collections.emptyList();
    }


}
