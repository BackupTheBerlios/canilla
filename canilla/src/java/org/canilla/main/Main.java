package org.canilla.main;

import org.canilla.client.CanillaClientBuilder;
import org.canilla.client.DefaultCanillaClient;

/**
 * @author Diego Romoli
 */
public class Main {
    
    private void go() {
        DefaultCanillaClient client = new CanillaClientBuilder().build();
        
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.go();
    }

}
