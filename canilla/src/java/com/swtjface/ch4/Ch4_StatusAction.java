package com.swtjface.ch4;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author dromoli - 09-Jan-2005
 */
public class Ch4_StatusAction extends Action {

    StatusLineManager statman;
    short triggercount = 0;
    
    public Ch4_StatusAction(StatusLineManager sm) {
        super("&Trigger@Ctrl+T", AS_PUSH_BUTTON);
        statman = sm;
        setToolTipText("Trigger the action");
        setImageDescriptor(ImageDescriptor.createFromFile(this.getClass(), "eclipse.gif"));
        setDescription("The action will be triggered");
    }
    
    public void run() {
        triggercount++;
        statman.setMessage("The status action has fired. Count: " + triggercount);
        System.out.println(this.TEXT);
    }
}
