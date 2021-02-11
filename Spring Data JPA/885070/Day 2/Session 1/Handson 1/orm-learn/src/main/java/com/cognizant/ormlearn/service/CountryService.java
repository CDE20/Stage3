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
	private CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries(){
		
		List<Country> countryList = countryRepository.findAll();
		return countryList;
	}
	
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException{
		Optional<Country> result = countryRepository.findById(countryCode);
		if(!result.isPresent()) {
			throw new CountryNotFoundException();
		}else {
			return result.get();
		}
	}
	
	@Transactional
	public void addCountry(Country Country) {
		countryRepository.save(Country);
	}
	
	@Transactional
	public void updateCountry(String code, String name) {
		Optional<Country> result = countryRepository.findById(code);
		Country country = result.get();
		country.setName(name);
	}
	
	@Transactional
	public void deleteCountry(String countryCode) {
		countryRepository.deleteById(countryCode);
	}
	
	@Transactional
	public List<Country> findByNameContaining(String name){
		List<Country> allCountries = countryRepository.findByNameContaining(name);
		return allCountries;
	}
	
	@Transactional 
	public List<Country> findByNameContainingOrderByAsc(String str){
		List<Country> list=countryRepository.findByNameContainingOrderByNameAsc(str);
		return list;
	}
	
	@Transactional
	public List<Country> findByNameStartingWith(String str){
		return countryRepository.findByNameStartingWith(str);
	}
}
