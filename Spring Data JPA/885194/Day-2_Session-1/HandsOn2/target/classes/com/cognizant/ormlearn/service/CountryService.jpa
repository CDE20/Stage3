package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {
	@Autowired
	CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException{
		Optional<Country> result = countryRepository.findById(countryCode);
		if (!result.isPresent()) {
			throw new CountryNotFoundException(countryCode);
		}
		return result.get();
	}
	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}
	@Transactional
	public void updateCountry(String code, String name) throws CountryNotFoundException {
		Country country = countryRepository.findById(code).get();
		if(country==null) {
			throw new CountryNotFoundException(code);
		}
		country.setName(name);
		countryRepository.save(country);
	}
	@Transactional
	public void deleteCountry(String code) {
		countryRepository.deleteById(code);
	}
	@Transactional
	public List<Country> search(String code){
		return countryRepository.findByNameContainsOrderByNameAsc(code);
		
	}
	@Transactional
	public List<Country> getAllCountriesSorted() {
		return countryRepository.findAllByOrderByNameAsc();
	}
}
