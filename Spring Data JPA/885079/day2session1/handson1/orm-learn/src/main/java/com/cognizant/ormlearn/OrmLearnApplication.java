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
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	public static void main(String[] args) throws CountryNotFoundException {
		
		//SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		//testAddCountry();
		//testGetAllCountries();
		//testDeleteCountry();
		//getAllCountriesTest();
		//testUpdateCountry();
		testSearchCountries();
		testSearchCountriesByAlphabet();
	}
	private static void testGetAllCountries() {

		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
		}
	private static void testAddCountry() {
		 Country country = new Country();
		 country.setCode("zz");
		 country.setName("zzzzzzz");
		 countryService.addCountry(country);
		 testGetAllCountries();
		 
	 }
	public static void testDeleteCountry() {
		String s="zz";
		countryService.deleteCountry(s);
		testGetAllCountries();
	}
	 private static void testUpdateCountry() throws CountryNotFoundException{
		 	LOGGER.info("Start");
			countryService.updateCountry("IN","INDIAA");
			getAllCountriesTest();
			LOGGER.info("End");
		}
	private static void getAllCountriesTest() throws CountryNotFoundException{

		LOGGER.info("Start");
		Country country = countryService.findCountryByCode("IN");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");
		}
	private static void testSearchCountries() throws CountryNotFoundException{
		List<Country> l=countryService.searchCountry("z");
		System.out.println(l);
		LOGGER.debug("countries={}", l);
	}
	private static void testSearchCountriesByAlphabet() throws CountryNotFoundException{
		List<Country> l=countryService.searchCountryByAlphabet("z");
		System.out.println(l);
		LOGGER.debug("countries={}", l);
	}
}


