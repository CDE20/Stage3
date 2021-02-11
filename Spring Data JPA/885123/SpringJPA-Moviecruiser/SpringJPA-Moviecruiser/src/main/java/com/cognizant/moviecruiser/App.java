package com.cognizant.moviecruiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cognizant.moviecruiser,com.cognizant.moviecruiser.service, com.cognizant.moviecruiser.repository, com.cognizant.moviecruiser.controller, com.cognizant.moviecruiser.model"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}