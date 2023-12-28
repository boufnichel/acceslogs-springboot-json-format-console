package org.boufnichel.accesslogconsole;

import ch.qos.logback.access.tomcat.LogbackValve;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccesslogConsoleApplication {

  public static void main(String[] args) {
    SpringApplication.run(AccesslogConsoleApplication.class, args);
  }

  @Bean
  public WebServerFactoryCustomizer<TomcatServletWebServerFactory> accessLogsCustomizer() {
    return factory -> {
      var logbackValve = new LogbackValve();
      logbackValve.setFilename("logback-access.xml");
      logbackValve.setAsyncSupported(true);
      factory.addContextValves(logbackValve);
    };
  }

}
