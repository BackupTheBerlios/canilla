package org.canilla.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.canilla.bo.Newsfeed;

/**
 * @author dromoli
 */
public class DefaultCanillaClient implements CanillaClient {

    private Log log = LogFactory.getLog(DefaultCanillaClient.class);
    // the newsfeeds this client is going to suck news from
    private List newsfeeds = new ArrayList();

    public DefaultCanillaClient() {
    }

    public List getNewsfeeds() {
        return newsfeeds;
    }

    public void setNewsfeeds(List theFeeds) {
        this.newsfeeds = theFeeds;
    }

    public void addNewsfeed(Newsfeed aFeed) {
        if (aFeed != null) {
            this.newsfeeds.add(aFeed);
        }
    }
}