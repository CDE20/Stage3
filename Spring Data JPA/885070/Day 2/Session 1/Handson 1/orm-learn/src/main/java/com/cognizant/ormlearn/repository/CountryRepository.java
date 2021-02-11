package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
	
	public List<Country> getAllCountries();
	public Country findCountryByCode(String countryCode);
	public void addCountry(Country Country);
	public void updateCountry(String code, String name);
	public void deleteCountry(String countryCode);
	public List<Country> findByNameContaining(String name);
	public List<Country> findByNameContainingOrderByNameAsc(String str);
	public List<Country> findByNameStartingWith(String str);
}
