package com.usa.ciclo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.usa.ciclo4.model"})
public class RetoCiclo4Application {

	public static void main(String[] args) {
		SpringApplication.run(RetoCiclo4Application.class, args);
	}

}