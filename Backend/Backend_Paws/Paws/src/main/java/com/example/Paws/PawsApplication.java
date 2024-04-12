package com.example.Paws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Paws.repository")
public class PawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PawsApplication.class, args);
	}

}
