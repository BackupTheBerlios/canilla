package com.swtjface.ch4;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

/**
 * @author dromoli - 09-Jan-2005
 */
public class Ch4_Contributions extends ApplicationWindow {

    StatusLineManager slm = new StatusLineManager();
    Ch4_StatusAction status_action = new Ch4_StatusAction(slm);
    ActionContributionItem aci = new ActionContributionItem(status_action);
    
    public Ch4_Contributions() {
        super(null);
        addStatusLine();
        addMenuBar();
        addToolBar(SWT.FLAT | SWT.WRAP);
    }
    
    protected Control createContents(Composite parent) {
        getShell().setText("Action/Contribution example");
        parent.setSize(290, 150);
        aci.fill(parent);
        return parent;
    }
    
    public static void main(String[] args) {
        Ch4_Contributions swin = new Ch4_Contributions();
        swin.setBlockOnOpen(true);
        swin.open();
        Display.getCurrent().dispose();
    }
    
    protected MenuManager createMenuManager() {
        MenuManager main_menu = new MenuManager(null);
        MenuManager action_menu = new MenuManager("Menu");
        main_menu.add(action_menu);
        action_menu.add(status_action);
        return main_menu;
    }
    
    protected ToolBarManager createToolBarManager(int style) {
        ToolBarManager tool_bar_manager = new ToolBarManager(style);
        tool_bar_manager.add(status_action);
        return tool_bar_manager;
    }
    
    protected StatusLineManager createStatusLineManager() {
        return slm;
    }
}
