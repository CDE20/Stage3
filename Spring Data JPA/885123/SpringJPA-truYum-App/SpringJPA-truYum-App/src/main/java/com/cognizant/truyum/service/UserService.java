package com.cognizant.truyum.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.model.User;
import com.cognizant.truyum.repository.UserRepository;

@Service
public class UserService{
	@Autowired
	UserRepository userRepository;
	@Transactional
	public User getUser(int userId) {
		return userRepository.getOne(userId);
	}

}