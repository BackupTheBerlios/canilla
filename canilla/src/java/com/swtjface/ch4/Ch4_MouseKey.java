package com.swtjface.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

/**
 * @author Diego Romoli
 */
public class Ch4_MouseKey extends Composite {
    
    Label output;
    
    public Ch4_MouseKey(Composite parent) {
        super(parent, SWT.NULL);
        Button typed = new Button(this, SWT.PUSH);
        typed.setText("Typed");
        typed.setLocation(2, 10);
        typed.pack();
        
        typed.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                keyHandler();
            }
        });
        
        Button untyped = new Button(this, SWT.PUSH);
        untyped.setText("Untyped");
        untyped.setLocation(80, 10);
        untyped.pack();
        untyped.addListener(SWT.MouseEnter, untypedListener);
        untyped.addListener(SWT.MouseExit, untypedListener);
        
        output = new Label(this, SWT.SHADOW_OUT);
        output.setBounds(40,70,90,40);
        output.setText("No event");
        
        pack();
    }
    
    Listener untypedListener = new Listener() {
        public void handleEvent(Event e) {
            switch(e.type) {
            	case SWT.MouseEnter:
            	    output.setText("Mouse enter");
            		break;
            	case SWT.MouseExit:
            	    output.setText("Mouse exit");
            		break;
            }
        }
    };
    
    void keyHandler() {
        output.setText("Key event");
    }

}
