package RESTfulPanthers.GeekText;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


//Main App
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"RESTfulPanthers.GeekText.Models"})
public class GeekTextApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeekTextApplication.class, args);
	}

}
