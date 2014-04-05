package sample.tomcat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sample.tomcat.web.SessionTrackingConfigListener;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SampleTomcatApplication {

    private static Log logger = LogFactory
            .getLog(SampleTomcatApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleTomcatApplication.class, args);
    }

    @Bean
    public SessionTrackingConfigListener sessionTrackingConfigListener() {
        SessionTrackingConfigListener listener = new SessionTrackingConfigListener();
        return listener;
    }
}
