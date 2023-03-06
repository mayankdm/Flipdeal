package flipdealitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FlipdealItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipdealItemApplication.class, args);
	}

}
