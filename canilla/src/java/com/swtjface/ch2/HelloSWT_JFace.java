package com.swtjface.ch2;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

/**
 * @author Diego Romoli
 */
public class HelloSWT_JFace extends ApplicationWindow {
    
    public HelloSWT_JFace() {
        super(null);
    }
    
    protected Control createContents(Composite parent) {
        Text helloText = new Text(parent, SWT.CENTER);
        helloText.setText("Hello with JFace!");
        parent.pack();
        return parent;
    }
    
    public static void main(String[] args) {
        HelloSWT_JFace hj = new HelloSWT_JFace();
        hj.setBlockOnOpen(true);
        hj.open();
        Display.getCurrent().dispose();
    }

}
