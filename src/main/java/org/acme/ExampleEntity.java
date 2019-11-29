package org.acme;

import org.acme.base.AbstractBaseLongEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author leandrosoares
 */
@Entity
@Table(name = "example")
public class ExampleEntity extends AbstractBaseLongEntity {

    public String code;
}
