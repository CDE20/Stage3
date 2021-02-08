package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	//@Autowired
	private static CountryService countryService;
	
	
	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

}
	private static void getAllCountriesTest() throws CountryNotFoundException {
		
		LOGGER.info("Start");
		Country country = countryService.findCountryByCode("US");
		LOGGER.debug("Country:{}",country);
		
		LOGGER.info("End");
	}
	
	private static void testAddCountry() {
		Country country = new Country();
		country.setCode("AB");
		country.setName("Abraham");
		countryService.addCountry(country);
	}
	
	private static void testUpdateCountry() throws CountryNotFoundException {
		
		countryService.updateCountry("US", "United States Of America");
	}
	
	private static void testDeleteCountry() {
		countryService.deleteCountry("AB");
	}

	
	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = Context.getBean(CountryService.class);
		LOGGER.info("in Main");
		//testGetAllCountries();
		//testAddCountry();
		//testDeleteCountry();
		try {
			//testUpdateCountry();
			getAllCountriesTest();
		} catch (CountryNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}

