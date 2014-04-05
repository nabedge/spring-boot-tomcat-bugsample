package sample.tomcat.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;

import org.springframework.boot.context.embedded.ServletContextInitializer;

public class SessionTrackingConfigListener implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {
        SessionCookieConfig sessionCookieConfig = servletContext
                .getSessionCookieConfig();
        // replace session id cookie name from default "JSESSIONID" to "FOOID"
        sessionCookieConfig.setName("FOOID");
    }

}
