package com.mycompany.demopractica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.jorge.repository")
@ComponentScan({"com.jorge.controller","com.jorge.config","com.jorge.service"})
@EntityScan("com.jorge.model")
public class DemopracticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemopracticaApplication.class, args);
	}
}
