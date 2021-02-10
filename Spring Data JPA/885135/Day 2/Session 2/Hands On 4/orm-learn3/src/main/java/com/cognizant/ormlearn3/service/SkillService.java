package com.cognizant.ormlearn3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn3.model.Skill;
import com.cognizant.ormlearn3.repository.SkillRepository;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;
	
	public Skill getSkillById(int id) {
		return skillRepository.findById(id);
	}
}
