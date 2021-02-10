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
	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) throws CountryNotFoundException {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);

		LOGGER.info("Inside main");
		testGetAllCountries();
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

	private static void testGetCountriesByCode() {

		LOGGER.info("Start");

		Country country = null;
		try {
			country = countryService.findCountryByCode("IN");
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
		}

		LOGGER.debug("Country={}", country);

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
		LOGGER.info("Start test 8");
		countryService.updateCountry("mg", "Madagascar");
		LOGGER.info("Stop Test 8");
	}

	private static void testDeleteCountry() {
		LOGGER.info("Start test 9");
		countryService.deleteCountry("ag");
		LOGGER.info("Stop test 9");

	}
}
