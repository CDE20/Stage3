package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	public static CountryService countryService;

	public static void main(String[] args) throws CountryNotFoundException {

		LOGGER.info("Inside main");
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);

		testGetAllCountries();
		testFindCountryByCode();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();

		testFindByNameContaining();
		testFindByNameContainingOrderByAsc();
		testfindByNameStartingWith();

	}

	private static void testGetAllCountries() throws CountryNotFoundException {

		LOGGER.info("Start");

		Country country = countryService.findCountryByCode("IN");
		LOGGER.debug("Country:{}", country);

		LOGGER.info("End");

	}

	private static void testFindCountryByCode() throws CountryNotFoundException {

		Country country = countryService.findCountryByCode("IN");
		System.out.println(country.getName());

	}

	public static void testAddCountry() throws CountryNotFoundException {

		Country newCountry = new Country();
		newCountry.setCode("UK");
		newCountry.setName("United Kingdom");
		countryService.addCountry(newCountry);
		testFindCountryByCode();

	}

	private static void testUpdateCountry() {
		countryService.updateCountry("UK", "United kingdom");
	}

	private static void testDeleteCountry() {
		countryService.deleteCountry("UK");
	}

	private static void testFindByNameContaining() {

		List<Country> cList = countryService.findByNameContaining("ia");
		System.out.println("COUTRIES CONTAINING ia IN NAME - ");
		for (Country c : cList) {
			System.out.println(c.getCode() + " " + c.getName());
		}

	}

	private static void testFindByNameContainingOrderByAsc() {

		List<Country> cList = countryService.findByNameContainingOrderByAsc("ia");
		System.out.println("COUTRIES CONTAINING ia IN NAME IN ASCENDING ORDER - ");
		for (Country c : cList) {
			System.out.println(c.getCode() + " " + c.getName());
		}

	}

	private static void testfindByNameStartingWith() {
		List<Country> list = countryService.findByNameStartingWith("Z");
		System.out.println("COUNTRIES STARTING WITH Z - ");
		for (Country c : list) {
			System.out.println(c.getCode() + " " + c.getName());
		}
	}
}