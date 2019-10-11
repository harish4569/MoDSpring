package mod.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ModServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModServerApplication.class, args);
	}

}
