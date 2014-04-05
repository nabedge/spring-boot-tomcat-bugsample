package sample.tomcat.web;

import java.util.EventListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.SessionCookieConfig;

public class SessionTrackingConfigListener implements ServletContextListener,
        EventListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        SessionCookieConfig sessionCookieConfig = servletContext
                .getSessionCookieConfig();
        // replace session id cookie name from default "JSESSIONID" to "FOOID"
        sessionCookieConfig.setName("FOOID");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
