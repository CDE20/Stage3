package com.cognizant.ormlearn4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn4.model.Attempt;
import com.cognizant.ormlearn4.model.User;
import com.cognizant.ormlearn4.service.AttemptService;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	private static AttemptService attemptService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ApplicationContext context = SpringApplication.run(Application.class, args);
		attemptService = context.getBean(AttemptService.class);
		LOGGER.info("Inside main"); 
		testGetAttempt();
	}
	
	public static void testGetAttempt() {
		Attempt a=attemptService.getAttemptById();
		System.out.println(a);
		}

}
