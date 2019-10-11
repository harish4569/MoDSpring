package mod.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableZuulProxy
@CrossOrigin("*")
public class ModGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModGateWayApplication.class, args);
	}

}
