package org.porotype.tktest;


import com.vaadin.addon.touchkit.extensions.TouchKitIcon;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.UI;
import javax.annotation.PostConstruct;

/**
 * The UI's "main" class
 */
@SuppressWarnings("serial")
@Widgetset("org.porotype.tktest.gwt.AppWidgetSet")
@Theme("touchkit")
@CDIUI
public class MyTouchKitUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
    }
    
    
    @PostConstruct
    public void init() {
        setContent(new Label("CDI chain works!"));
    }
}
