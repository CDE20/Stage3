package com.cognizant.ormlearn.service;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Attempt;
import com.cognizant.ormlearn.model.User;
import com.cognizant.ormlearn.repository.AttemptRepository;

@Service
public class AttemptService {
	
	@Autowired
	private AttemptRepository attemptRepository;
	
	@Transactional
	public Attempt getAttemptById() {
		return attemptRepository.getAttempt(1, 2);
	}
	
	
}