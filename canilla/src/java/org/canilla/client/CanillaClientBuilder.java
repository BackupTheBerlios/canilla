package org.canilla.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.canilla.bo.Newsfeed;
import org.canilla.exception.RuntimeConfigurationException;

/**
 * @author dromoli
 * 
 * Reads configuration files and builds an instance of CanillaClient.
 */
public class CanillaClientBuilder {

    private final static String confFile = "/config/conf.properties";
    private final static Log log = LogFactory.getLog(CanillaClientBuilder.class);

    public DefaultCanillaClient build() throws RuntimeConfigurationException {
        Properties props = new Properties();
        loadProperties(props);
        
        DefaultCanillaClient client = new DefaultCanillaClient();
        Newsfeed nf = new Newsfeed();
        nf.setAddress(props.getProperty("main-newsfeed.address"));
        nf.setPort(props.getProperty("main-newsfeed.port"));
        nf.setNickname(props.getProperty("main-newsfeed.nickname"));
        nf.setUsername(props.getProperty("main-newsfeed.username"));
        nf.setPassword(props.getProperty("main-newsfeed.password"));
        client.addNewsfeed(nf);
        
        client.setSpool(props.getProperty("article-spool"));
        client.initialize();
        return client;
    }
    
    private void loadProperties(Properties props) throws RuntimeConfigurationException {
        InputStream is = this.getClass().getResourceAsStream(confFile);
        if(is == null)
            log.debug("InputStream is null");
        try {
            props.load(is);
            is.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}