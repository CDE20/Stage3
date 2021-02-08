package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}
	
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException
	{
		Optional<Country> result= countryRepository.findById(countryCode);
		
		if(!result.isPresent()) {
			throw new CountryNotFoundException();
		}
		else {
			Country country = result.get();
			return country;
		}
	}
	
	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}
	
	@Transactional
	public void updateCountry(String code,String name) {
		Optional<Country> country = countryRepository.findById(code);
		Country temp= country.get();
		temp.setName(name);
		countryRepository.save(temp);
	}
	
	@Transactional
	public void deleteCountry(String code) {
		
		countryRepository.deleteById(code);
	}
}
