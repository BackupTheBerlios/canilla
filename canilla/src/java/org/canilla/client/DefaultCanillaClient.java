package org.canilla.client;

import java.util.List;

import org.apache.commons.logging.*;

/**
 * @author dromoli
 */
public class DefaultCanillaClient implements CanillaClient {

    private Log log = LogFactory.getLog(DefaultCanillaClient.class);
    // the newsfeeds this client is going to suck news from
    private List newsfeeds;
    
    private DefaultCanillaClient() {
        
    }
    
    public CanillaClient getInstance() {
        return null;
    }
    
}
