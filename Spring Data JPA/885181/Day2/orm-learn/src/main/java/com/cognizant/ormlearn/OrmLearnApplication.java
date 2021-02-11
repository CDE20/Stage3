package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	public static void main(String[] args) throws CountryNotFoundException{
		SpringApplication.run(OrmLearnApplication.class, args);
		
		
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        LOGGER.info("Inside main");
		testGetAllCountries();
		getAllCountriesTest();
		testAddCountry();
		testUpdateCountry();
		//testDeleteCountry();
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
	
	private  static void testAddCountry()   {
		LOGGER.info("Start");
		Country co=new Country();
		co.setCode("TA");
		co.setName("Trinidad");
		countryService.addCountry(co);
		LOGGER.info("End");
	}
	
	private static void testUpdateCountry()
	{
		LOGGER.info("Start");
		countryService.updateCountry("US", "America");
		LOGGER.info("End");
	}
	
	private static void testDeleteCountry()
	{
		LOGGER.info("Start");
		 countryService.deleteCountry("AM");
		 LOGGER.info("End");
		
	}
	private static void testSearchCountryName() {
		LOGGER.info("Start");
		countryService.SearchCountry("land");
		 LOGGER.info("End");
		
	}
}
