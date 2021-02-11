package com.cognizant.truyum;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.cognizant.truyum, com.cognizant.truyum.controller,com.cognizant.truyum.model,com.cognizant.truyum.service, com.cognizant.truyum.repository"})
public class App {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(App.class, args);

	}
}