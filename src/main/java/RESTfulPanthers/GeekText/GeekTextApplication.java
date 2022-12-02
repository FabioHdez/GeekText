package RESTfulPanthers.GeekText;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GeekTextApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeekTextApplication.class, args);
	}

}
