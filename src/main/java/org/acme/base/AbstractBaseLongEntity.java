package org.acme.base;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author leandrosoares
 */

@MappedSuperclass
public abstract class AbstractBaseLongEntity extends PanacheEntityBase {

    /**
     * The auto-generated ID field. This field is set by Hibernate ORM when this entity
     * is persisted.
     *
     * @see #persist()
     */
    @Id
    @GeneratedValue
    public Long id;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "<" + id + ">";
    }
}
