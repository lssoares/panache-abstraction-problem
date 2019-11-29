package org.acme;

import org.acme.base.AbstractBaseLongRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author leandrosoares
 */
@ApplicationScoped
public class ExampleRepository


// swap the two lines below and see the problem.
extends AbstractBaseLongRepository<ExampleEntity> {
//implements PanacheRepositoryBase<ExampleEntity, Long> {


}
