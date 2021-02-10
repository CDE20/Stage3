package com.cognizan.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cognizan.ormlearn.model.Country;
	
    @Repository
	public interface CountryRepository extends JpaRepository<Country, String> {
    	List<Country> findByNameContainingOrderByNameAsc(String name);

		

	}


