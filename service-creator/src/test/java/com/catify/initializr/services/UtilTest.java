package com.catify.initializr.services;

import java.nio.file.Path;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author claus
 */
public class UtilTest {
    
    public UtilTest() {
    }

    /**
     * Test of cleanPackageName method, of class Util.
     */
    @Test
    public void testCleanPackageName() {
        System.out.println("cleanPackageName");
        String result = Util.cleanPackageName("com.foo.bar");
        assertEquals("com/foo/bar", result);
    }

    /**
     * Test of cleanServiceName method, of class Util.
     */
    @Test
    public void testCreateServiceName() {
        System.out.println("cleanServiceName");
        String result = Util.createServiceName("Foo-bar.fUu_bor bul");
        assertEquals("foobarfuuborbul", result);
    }

    /**
     * Test of createServiceId method, of class Util.
     */
    @Test
    public void testCreateServiceId() {
        System.out.println("createServiceId");
        String result = Util.createServiceId("demo-service-a");
        assertEquals("DemoServiceA", result);
    }
    
}
