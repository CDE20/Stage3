package com.cognizant.ormlearn4.service;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn4.model.Attempt;
import com.cognizant.ormlearn4.model.User;
import com.cognizant.ormlearn4.repository.AttemptRepository;

@Service
public class AttemptService {
	
	@Autowired
	private AttemptRepository attemptRepository;
	
	@Transactional
	public Attempt getAttemptById() {
		return attemptRepository.getAttempt(1, 2);
	}
	
	
}
