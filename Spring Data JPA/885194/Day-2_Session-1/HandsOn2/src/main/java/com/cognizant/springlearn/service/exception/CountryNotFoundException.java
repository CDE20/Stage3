package com.cognizant.springlearn.service.exception;

public class CountryNotFoundException extends Exception {
	public CountryNotFoundException(String countryCode) {
		super(countryCode+" not found");
		// TODO Auto-generated constructor stub
	}

}
