package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) throws CountryNotFoundException {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);

		testGetAllCountries();

		testFindCountryByCode();

		testAddCountry();

		testUpdateCountry();
		
		testDeleteCountry();

		LOGGER.info("Inside main");
	}

	private static void testGetAllCountries() {
		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");
	}

	private static void testFindCountryByCode() throws CountryNotFoundException {
		LOGGER.info("Start");

		Country country = countryService.findCountryByCode("BM");
		LOGGER.debug("country:{}", country);

		LOGGER.info("End");
	}

	private static void testAddCountry() throws CountryNotFoundException {
		LOGGER.info("Start");

		Country country = new Country();
		country.setCode("NN");
		country.setName("NewCountryName");
		countryService.addCountry(country);
		
		Country country2 = countryService.findCountryByCode("NN");
		
		if (!country.equals(country2)) {
			LOGGER.error("AddCountry Failed!!");
		}
		

		LOGGER.info("End");
	}

	private static void testUpdateCountry() {
		LOGGER.info("Start");
		
		countryService.updateCountry("NN", "updated country name");
		
		LOGGER.info("End");
	}
	
	private static void testDeleteCountry() {
		LOGGER.info("Start");

		countryService.deleteCountry("IN");

		LOGGER.info("End");
	}

}
