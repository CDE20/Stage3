package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	public static void main(String[] args) throws CountryNotFoundException {
		//SpringApplication.run(OrmLearnApplication.class, args);
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		getAllCountriesTest();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();
		testSearchCountries();
		LOGGER.info("Inside main");
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
		Country country=new Country();
		country.setCode("EH");
		country.setName("western sahara");
		countryService.addCountry(country);
		countryService.findCountryByCode("YE");
	}
	
	private static void testUpdateCountry() throws CountryNotFoundException {
		countryService.updateCountry("YE", "yemen");
	}
	
	private static void testDeleteCountry() {
		countryService.deleteCountry("EH");
	}
	
	private static void testSearchCountries() {
		List<Country> countries=countryService.searchCountries("an");
		LOGGER.debug("countries={}", countries);
	}
}
