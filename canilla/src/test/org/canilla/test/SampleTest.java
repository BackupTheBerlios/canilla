

package org.canilla.test;

import junit.framework.TestCase;

import org.canilla.client.CanillaClient;
import org.canilla.client.CanillaClientBuilder;

/**
 * @author Diego Romoli
 */
public class SampleTest extends TestCase {

    CanillaClient client;
    
    public SampleTest(String name) {
        super(name);
    }
    
    protected void setUp() throws Exception {
        CanillaClientBuilder builder = new CanillaClientBuilder();
        client = builder.build();        
    }
    
    public void testConfiguration() {
        assertEquals(client.getNewsfeeds().size(), 1);
        
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
