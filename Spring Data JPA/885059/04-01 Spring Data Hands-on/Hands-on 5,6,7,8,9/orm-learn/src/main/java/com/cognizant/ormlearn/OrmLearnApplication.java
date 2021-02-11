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
		try {
			getAllCountriesTest();
			testAddCountry();
			testUpdateCountry();
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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

	private static void testAddCountry() throws CountryNotFoundException {

		LOGGER.info("Start");
		Country demoCountry = new Country();
		demoCountry.setCode("ZZ");
		demoCountry.setName("DEMO");
		countryService.addCountry(demoCountry);
		Country country = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");

	}
	
	private static void testUpdateCountry() throws CountryNotFoundException {

		LOGGER.info("Start");
		countryService.updateCountry("ZZ", "ZIMWAMBE");
		Country country = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");

	}
	
	private static void testDeleteCountry() {

		LOGGER.info("Start");
		countryService.deleteCountry("ZZ");
		LOGGER.info("End");

	}

}
