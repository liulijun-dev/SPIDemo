package com.learning.spi;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ServiceLoader;


public class HelloTest extends TestCase {

    private ServiceLoader<IHello> loader;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        loader = ServiceLoader.load(IHello.class);
    }

    @Test
    public void testHelloImpl() {
        for(IHello hello : loader) {
            hello.hello();
        }
    }
}
