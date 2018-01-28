package es.jmpalma.tutorial.springcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
//@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerApplication.class, args);
	}
}
