package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.CountryRepository.CountryRepository;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;
	
	@Transactional 
	public List<Country> getAllCountries(){
	return countryRepository.findAll();
		
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
	public void addCountry(Country country)
	{
		countryRepository.save(country);
	}
	
	@Transactional 
	public void updateCountry(String countryCode, String countryName )
	{
			{
				
				 Optional<Country> country=countryRepository.findById(countryCode);
				 Country co=country.get();
				 //System.out.println(c1);
				 co.setName(countryName);
				 countryRepository.save(co);
	   }
	
	}
	
	@Transactional 
	public void deleteCountry(String countryCode)
	{
		
		{
			countryRepository.deleteById(countryCode);
		}
	}

}
