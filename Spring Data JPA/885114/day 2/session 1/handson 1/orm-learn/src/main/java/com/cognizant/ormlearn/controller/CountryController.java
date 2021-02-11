package com.cognizant.ormlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String show() {
		return "countries";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String displayCountries(@RequestParam("search") String search, ModelMap map) {

		List<Country> list = countryService.getCountriesContaining(search);
		
		map.addAttribute("countryList", list);
		map.addAttribute("search", search);
		
		return "countries";
	}
	
	@RequestMapping("/letter")
	public String letterCountries(@RequestParam("search") String search, ModelMap map) {
		
		List<Country> list = countryService.getCountriesStartingWith(search);
		map.addAttribute("countryList", list);
		
		return "countries";
	}

}
