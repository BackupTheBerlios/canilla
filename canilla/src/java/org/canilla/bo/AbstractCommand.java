package org.canilla.bo;

/**
 * @author Diego Romoli
 */
public abstract class AbstractCommand {

    private String name;
    
    public AbstractCommand() {
        
    }
    
    public abstract String execute();
    
}
