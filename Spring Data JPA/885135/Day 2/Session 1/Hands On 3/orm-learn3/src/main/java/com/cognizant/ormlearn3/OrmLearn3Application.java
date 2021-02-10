package com.cognizant.ormlearn3;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearn3Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearn3Application.class);

	public static void main(String[] args) {
		SpringApplication.run(OrmLearn3Application.class, args);
		LOGGER.info("Inside main");
	}

}
