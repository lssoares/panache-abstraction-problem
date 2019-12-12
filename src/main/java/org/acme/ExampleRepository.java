package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import org.acme.base.AbstractBaseLongRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author leandrosoares
 */

@ApplicationScoped
public class ExampleRepository extends AbstractBaseLongRepository<ExampleEntity>
        // implementing the interface is redundant as the abstract class already does it.
        // Unfortunately this was the only way to workaround issue https://github.com/quarkusio/quarkus/issues/5885
        implements PanacheRepositoryBase<ExampleEntity, Long> {


}

