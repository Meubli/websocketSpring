package totofr.smsif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Classe principale de l'application Spring.
 * 
 * @author m.guinchard
 *
 */
@SpringBootApplication
@ConfigurationPropertiesScan
@ComponentScan
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
	SpringApplication springApplication = new SpringApplication(Application.class);
	springApplication.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
	return springApplicationBuilder.sources(Application.class);
    }

}