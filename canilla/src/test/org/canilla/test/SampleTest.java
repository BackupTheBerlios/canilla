

package org.canilla.test;

import junit.framework.TestCase;

import org.canilla.bo.Newsfeed;
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
        Newsfeed nf = (Newsfeed)client.getNewsfeeds().get(0);
        assertEquals(nf.getAddress(), "news.individual.net");
        assertEquals(nf.getNickname(), "cis");
        assertEquals(nf.getPassword(), "quugubip");
        assertEquals(nf.getPort(), "119");
        assertEquals(nf.getUsername(), "romoli");
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
