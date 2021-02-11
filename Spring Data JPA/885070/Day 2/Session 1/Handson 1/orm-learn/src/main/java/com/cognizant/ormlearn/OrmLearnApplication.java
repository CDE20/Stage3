package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

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
		Country country = new Country();
		country.setCode("HL");
		country.setName("Holland");
		countryService.addCountry(country);
		try {
			countryService.findCountryByCode("HL");
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testDeleteCountry() {
		countryService.deleteCountry("HL");
	}

	private static void testFindByNameContaining() {
		
		LOGGER.info("Start");

		List<Country> cList = countryService.findByNameContaining("ou");
		for (Country c : cList) {
			System.out.println(c.getCode() + " " + c.getName());
		}

		LOGGER.info("End");

	}

	private static void testFindByNameContainingOrderByAsc() {
		
		LOGGER.info("Start");
		
		List<Country> cList = countryService.findByNameContainingOrderByAsc("ou");
		for (Country c : cList) {
			System.out.println(c.getCode() + " " + c.getName());
		}
		
		LOGGER.info("End");
	}

	private static void testfindByNameStartingWith() {
		
		LOGGER.info("Start");
		
		List<Country> list = countryService.findByNameStartingWith("z");
		for (Country c : list) {
			System.out.println(c.getCode() + " " + c.getName());
		}
		
		LOGGER.info("End");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		try {
			getAllCountriesTest();
		} catch (CountryNotFoundException e) {
			e.printStackTrace();
		}
		testAddCountry();
		testDeleteCountry();
		testFindByNameContaining();
		testFindByNameContainingOrderByAsc();
		testfindByNameStartingWith();

	}

}
