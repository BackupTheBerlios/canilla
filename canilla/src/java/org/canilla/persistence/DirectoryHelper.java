package org.canilla.persistence;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.canilla.bo.Newsfeed;

/**
 * @author Diego Romoli
 */
public class DirectoryHelper {

    private static Log log = LogFactory.getLog(DirectoryHelper.class);

    public static void checkSpoolDirectories(String spoolDir, List addresses) {
        // TODO check for null
        if (addresses == null)
            return;
        for (Iterator iter = addresses.iterator(); iter.hasNext();) {
            Newsfeed nf = (Newsfeed) iter.next();
            String s = spoolDir + System.getProperty("file.separator")
                    + nf.getAddress();
            File spool = new File(s);
            if (!spool.exists()) {
                spool.mkdirs();
                log.info("Created spool directory");
            }
        }
    }
    
    
}