package org.acme.base;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leandrosoares
 */
@QuarkusTest
public class ExampleTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleTest.class);


    @Test
    public void nothing() {
        Assertions.assertTrue(true);
    }


}
