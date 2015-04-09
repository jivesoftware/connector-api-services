package com.jivesoftware.services;

import com.jivesoftware.services.api.ServicesResource;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


/**
 * Created by erwolff on 4/1/15.
 */
public class ServicesMain {
    public static void main(String[] args) throws Exception {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        Server jettyServer = new Server(19400);
        jettyServer.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet(
                org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);

        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter(
                "jersey.config.server.provider.classnames", ServicesResource.class.getCanonicalName());

        try {
            jettyServer.start();
            jettyServer.join();
            System.out.println("server started");
        } finally {
            jettyServer.destroy();
        }
    }
}
