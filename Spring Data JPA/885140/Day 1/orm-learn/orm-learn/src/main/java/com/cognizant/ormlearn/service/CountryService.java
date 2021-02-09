package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
		
	@Transactional
	public List<Country> getAllCountries(){
		
		return countryRepository.findAll();
	}
	
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException{
		
		Optional<Country> result = countryRepository.findById(countryCode);
		if(result.isPresent())
		{
			Country country = result.get();
			return country;
		}
		else
			throw new CountryNotFoundException("No Country Found");
			
	}
	
	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}
	
	@Transactional
	public void updateCountry(String code,String name) throws CountryNotFoundException {
		
		Optional<Country> result = countryRepository.findById(code);
		if(result.isPresent()) {
			Country country = result.get();
			country.setName(name);
			countryRepository.save(country);
		}
		else
			throw new CountryNotFoundException("No Country Found");
	}
	
	@Transactional
	public void deleteCountry(String CountryCode) {
		countryRepository.deleteById(CountryCode);
	}
	
}
