package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Attempt;
import com.cognizant.ormlearn.model.User;
import com.cognizant.ormlearn.service.AttemptService;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static AttemptService attemptService;
	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		attemptService = context.getBean(AttemptService.class);
		LOGGER.info("Inside main"); 
		testGetAttempt();
	}
	
	public static void testGetAttempt() {
		Attempt a=attemptService.getAttemptById();
		//LOGGER.debug("Attempt:{}", attemptService.getAttemptById());
		System.out.println(a.getId()+" "+a.getScore()+" "+a.getUser().getName());
		
		
	}

}