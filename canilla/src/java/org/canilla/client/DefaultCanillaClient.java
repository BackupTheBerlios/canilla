package org.canilla.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.canilla.bo.Newsfeed;
import org.canilla.persistence.DirectoryHelper;

/**
 * @author dromoli
 */
public class DefaultCanillaClient implements CanillaClient {

    private Log log = LogFactory.getLog(DefaultCanillaClient.class);
    // the newsfeeds this client is going to suck news from
    private List newsfeeds = new ArrayList();
    // the directory under which we store articles
    private String spool;

    private Socket socket = null;
    private BufferedReader in = null;
    private Writer out = null;

    public void initialize() {
        try {
            Newsfeed mainNewsfeed = (Newsfeed) newsfeeds.get(0);
            socket = new Socket(mainNewsfeed.getAddress(), Integer
                    .parseInt(mainNewsfeed.getPort()));
            in = new BufferedReader(new InputStreamReader(socket
                    .getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket
                    .getOutputStream()));
            DirectoryHelper.checkSpoolDirectories(spool,newsfeeds);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String executeModeReader() {
        String response = null;
        try {
            out.write("mode reader");
            out.flush();
            while ((response = in.readLine()) == null) {
            }            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
    
    public String getSpool() {
        return spool;
    }
    
    public void setSpool(String spool) {
        this.spool = spool;
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