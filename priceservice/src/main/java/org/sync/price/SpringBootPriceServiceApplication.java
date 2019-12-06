package org.sync.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan("org.sync.price")
@SpringBootApplication
public class SpringBootPriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPriceServiceApplication.class, args);
	}
}
