package org.canilla.client;

import java.util.List;

import org.canilla.bo.Newsfeed;

/**
 * @author Diego Romoli
 */
public interface CanillaClient {
    public List getNewsfeeds();
    public void setNewsfeeds(List theFeeds);
    public void addNewsfeed(Newsfeed aFeed);
}