package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;

	public static void main(String[] args) {
		// SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");
		
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);

		testGetAllCountries();
		
		//testGetCountriesByCode();
		
		//testAddCountry();
	}
	private static void testGetAllCountries() {

		LOGGER.info("Start");
		 
		List<Country> country =countryService.getAllCountries();
		LOGGER.debug("Country={}", country);

		LOGGER.info("End");
	}

	

}
