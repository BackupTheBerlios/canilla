package com.swtjface.ch3;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

import com.swtjface.ch4.Ch4_MouseKey;

/**
 * @author Diego Romoli
 */
public class CompViewer extends ApplicationWindow {
    
    public CompViewer() {
        super(null);
    }
    
    protected Control createContents(Composite parent) {
        //Ch3_Group comp = new Ch3_Group(parent);
        //Ch3_SashForm comp = new Ch3_SashForm(parent);
        Ch4_MouseKey comp = new Ch4_MouseKey(parent);
        return comp;
    }
    
    public static void main(String[] args) {
        CompViewer cv = new CompViewer();
        cv.setBlockOnOpen(true);
        cv.open();
        Display.getCurrent().dispose();
    }

}
