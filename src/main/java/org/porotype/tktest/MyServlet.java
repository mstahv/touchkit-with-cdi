package org.porotype.tktest;

import com.vaadin.addon.touchkit.server.TouchKitServlet;
import com.vaadin.cdi.CDIUIProvider;
import com.vaadin.server.ServiceException;
import com.vaadin.server.SessionInitEvent;
import com.vaadin.server.SessionInitListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/*")
public class MyServlet extends TouchKitServlet {
    
    private final CDIUIProvider uiProvider = new CDIUIProvider();
    
    @Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();
        getService().addSessionInitListener(new SessionInitListener() {
            @Override
            public void sessionInit(SessionInitEvent event) throws ServiceException {
                event.getSession().addUIProvider(uiProvider);
            }
        });
    }

}
