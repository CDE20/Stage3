package com.cognizant.ormlearn;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;

	public static void main(String[] args) throws CountryNotFoundException {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);

		testGetAllCountries();
		System.out.println("All countries found");
		
		testFindCountryByCode();
		
		testAddCountry();
		System.out.println("Country is added");
		
		testUpdateCountry();
		System.out.println("Country is updated");
		
		testDeleteCountry();
		System.out.println("Country is deleted");

	}

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

	private static void testFindCountryByCode() throws CountryNotFoundException {
		LOGGER.info("Start");
		Country country = null;
		try {
			country = countryService.findCountryByCode("US");
//			country = countryService.findCountryByCode("XYZ");
		} catch (CountryNotFoundException e) {
			System.out.println("	Country not found");
		}
		LOGGER.debug("country:{}", country);
		LOGGER.info("End");
	}

	private static void testAddCountry() throws CountryNotFoundException {
		LOGGER.info("Start");
		Country country = new Country();
		country.setCode("NR");
		country.setName("Norway");
		countryService.addCountry(country);
		Country country2 = countryService.findCountryByCode("NR");	
		LOGGER.info("End");
	}
	
	private static void testUpdateCountry() {
		LOGGER.info("Start");
		countryService.updateCountry("NR", "Updated Norway");
		LOGGER.info("End");
	}

	private static void testDeleteCountry() {
		LOGGER.info("Start");
		countryService.deleteCountry("NR");
		LOGGER.info("End");
	}
}