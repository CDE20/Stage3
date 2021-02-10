package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.Exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;

@Service
public class CountryService {
	@Autowired
	CountryRepository countryRepository;
	
	@Transactional
	public  List <Country> getAllCountries(){
		return countryRepository.findAll();
		
	}
	
	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException
	{
		Optional<Country> result = countryRepository.findById(countryCode);
		
		
		if (!result.isPresent())
		{
			throw new CountryNotFoundException();
		}
		return result.get();
		
	}
	
	@Transactional
	public void addCountry(Country country)
	{
		countryRepository.save(country);
	}
	@Transactional
	public void deleteCountry(String countryCode)
	{
		countryRepository.deleteById(countryCode);
	}
	@Transactional
	public void updateCountry(String countryCode, String countryName)
	{
		
		 Optional<Country> country=countryRepository.findById(countryCode);
		 Country c1=country.get();
		 //System.out.println(c1);
		 c1.setName(countryName);
		 countryRepository.save(c1);
		
	}
}