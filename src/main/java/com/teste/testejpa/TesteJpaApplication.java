package com.teste.testejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
	"com.teste.testejpa.models"
	})
@EnableJpaRepositories(basePackages = {
	"com.teste.testejpa.repositorio"
	})
public class TesteJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteJpaApplication.class, args);
	}

}
