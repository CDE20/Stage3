package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Options;

public interface OptionsRepository extends JpaRepository<Options, String>{

}