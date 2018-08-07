package com.evolvus.camle.SpringBootCamle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.evolvus.camel")
public class SpringBootCamleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamleApplication.class, args);
	}
}
