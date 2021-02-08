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
	
	public static void main(String[] args) throws CountryNotFoundException {
		LOGGER.info("Inside main");
		
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		
		testGetAllCountries();
		getAllCountriesTest();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();
	}

	
	private static void testGetAllCountries() {
		LOGGER.info("Start");
		
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}
	
	private static void getAllCountriesTest() throws CountryNotFoundException {
		LOGGER.info("Start");
		
		Country country = countryService.findCountryByCode("IN");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");
	}
	
	private static void testAddCountry() {
		LOGGER.info("Start");
		Country country = new Country();
		country.setName("United Kingdom");
		country.setCode("UK");
		countryService.addCountry(country);
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");
	}
	
	
	private static void testUpdateCountry() {
		LOGGER.info("Start");
		countryService.updateCountry("US", "United States");
		LOGGER.info("End");
	}
	
	private static void testDeleteCountry() {
		LOGGER.info("Start");
		countryService.deleteCountry("UK");
		LOGGER.info("End");
	}
	
}
