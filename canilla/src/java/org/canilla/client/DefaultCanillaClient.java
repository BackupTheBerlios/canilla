package org.canilla.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author dromoli
 */
public class DefaultCanillaClient implements CanillaClient {

    private Log log = LogFactory.getLog(DefaultCanillaClient.class);
    // the newsfeeds this client is going to suck news from
    private List newsfeeds = new ArrayList();
    
    private DefaultCanillaClient() {
    }
    
    public CanillaClient getInstance() {
        return null;
    }
    
}
