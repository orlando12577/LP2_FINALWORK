package com.example.lp2_finalwork;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Micro Service Leilão", version = "1.0",description = " Leilão "))
public class Lp2FinalworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lp2FinalworkApplication.class, args);
	}

}
