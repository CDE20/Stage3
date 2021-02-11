package com.cognizant.ormlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Attempt;
import com.cognizant.ormlearn.repository.AttemptRepository;

@Service
public class AttemptService {
	@Autowired
	AttemptRepository attemptRepository;
	public Attempt getAttempt(int userId, int attemptId) {
		return attemptRepository.getAttempt(userId, attemptId);
	}
	public Attempt getAttemptDetail(int userId, int attemptId) {
		return attemptRepository.getAttemptDetail(userId, attemptId);
	}

}
