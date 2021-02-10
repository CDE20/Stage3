package com.cognizan.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizan.ormlearn.service.CountryService;
import com.cognizan.springlearn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import com.cognizan.ormlearn.model.Country;

@SpringBootApplication
public class OrmLearnApplication {

	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) throws CountryNotFoundException {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
		
		LOGGER.info("Inside main");
		testGetAllCountries();
		getAllCountriesTest();
		testAddCountry();
		testDeleteCountry();
		testUpdateCountry();
		testSearchCountryName();
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
		Country c=new Country();
		c.setCode("ZW");
		c.setName("Zimbabwe");
		countryService.addCountry(c);
		countryService.findCountryByCode("ZW");
		LOGGER.info("End");
		
	}
	private static void testDeleteCountry()
	{
		 LOGGER.info("Start");
		 countryService.deleteCountry("ZW");
		 LOGGER.info("End");
	}
	private static void testUpdateCountry()
	{
		LOGGER.info("Start");
		countryService.updateCountry("US", "America");
		LOGGER.info("End");
	}
	private static void testSearchCountryName()
	{
		countryService.SearchCountry("In");
	}
	
	

}
