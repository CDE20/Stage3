package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

	@Transactional
	public void addCountry(Country country) {
	countryRepository.save(country);
	}
	
	@Transactional
	public void deleteCountry(String id) {
	countryRepository.deleteById(id);
	}
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException{
		Optional<Country> result = countryRepository.findById(countryCode);
		if (!result.isPresent())
		{
			throw new CountryNotFoundException();
		}
		Country country = result.get();
		return country;
	}
	@Transactional
	public void updateCountry(String code,String cname) throws CountryNotFoundException{
		Optional<Country> result = countryRepository.findById(code);
		if (!result.isPresent())
		{
			throw new CountryNotFoundException();
		}
		Country country = result.get();
		country.setName(cname);
		countryRepository.save(country);
	}
	
	@Transactional
	public List<Country> searchCountry(String name) throws CountryNotFoundException{
		return countryRepository.findByNameContainingOrderByNameAsc(name);
	}
	@Transactional
	public List<Country> searchCountryByAlphabet(String name) throws CountryNotFoundException{
		return countryRepository.findByNameStartingWith(name);
	}
}
