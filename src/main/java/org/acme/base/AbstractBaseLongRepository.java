package org.acme.base;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

/**
 * @author leandrosoares
 */
public class AbstractBaseLongRepository<T extends AbstractBaseLongEntity> implements PanacheRepositoryBase<T, Long> {
}
