package com.swtjface.ch2;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import com.swtjface.ch3.Ch3_Composite;

/**
 * @author Diego Romoli
 */
public class WidgetWindow extends ApplicationWindow {
    
    public WidgetWindow() {
        super(null);
    }
    
    protected Control createContents(Composite parent) {
        
        TabFolder tf = new TabFolder(parent, SWT.NONE);
        TabItem chap3 = new TabItem(tf, SWT.NONE);
        chap3.setText("Chapter 3");
        chap3.setControl(new Ch3_Composite(tf));
        
        getShell().setText("Widget Window");
        //parent.setSize(400, 250);
        return parent;
    }
    
    public static void main(String[] args) {
        WidgetWindow ww = new WidgetWindow();
        ww.setBlockOnOpen(true);
        ww.open();
        Display.getCurrent().dispose();
    }

}
