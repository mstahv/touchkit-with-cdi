package org.porotype.tktest;

import com.vaadin.addon.touchkit.server.TouchKitServlet;
import com.vaadin.cdi.server.VaadinCDIServletService;
import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.ServiceException;
import com.vaadin.server.VaadinServletService;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/*")
public class MyServlet extends TouchKitServlet {

    @Override
    protected VaadinServletService createServletService(
            DeploymentConfiguration deploymentConfiguration)
            throws ServiceException {
        super.createServletService(deploymentConfiguration);
        VaadinCDIServletService service = new VaadinCDIServletService(this,
                deploymentConfiguration);
        service.init();
        return service;
    }

}
