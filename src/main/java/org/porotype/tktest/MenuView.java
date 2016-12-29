package org.porotype.tktest;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.cdi.UIScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@SuppressWarnings("serial")
@UIScoped
public class MenuView extends NavigationView {
    
    @Inject
    // Lazy init a sub view using Instance
    private Instance<FormView> formView;

    public MenuView() {
        setCaption("Menu");
        
        final VerticalComponentGroup content = new VerticalComponentGroup();
        NavigationButton button = new NavigationButton("Form");
        button.addClickListener(new NavigationButtonClickListener() {
            @Override
            public void buttonClick(NavigationButtonClickEvent event) {
                getNavigationManager().navigateTo(formView.get());                
            }
        });
        content.addComponent(button);
        setContent(content);
    };
}
