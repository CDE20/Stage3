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
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(countryCode);

		if (!result.isPresent())
			throw new CountryNotFoundException();

		Country country = result.get();

		return country;
	}

	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}

	@Transactional
	public void updateCountry(String countryCode, String countryName) {
		Optional<Country> result = countryRepository.findById(countryCode);
		if (result.isPresent()) {
			Country country = result.get();
			country.setCode(countryCode);
			country.setName(countryName);
		}
	}

	@Transactional
	public void deleteCountry(String countryCode) {
		Optional<Country> optional = countryRepository.findById(countryCode);

		if (optional.isPresent()) {
			countryRepository.deleteById(countryCode);
		}
	}

	@Transactional
	public List<Country> getCountriesContaining(String search) {
		List<Country> list = countryRepository.findByNameContainingOrderByNameAsc(search);
		return list;
	}

	@Transactional
	public List<Country> getCountriesStartingWith(String search) {
		List<Country> list = countryRepository.findByNameStartingWith(search);
		return list;
	}
}
