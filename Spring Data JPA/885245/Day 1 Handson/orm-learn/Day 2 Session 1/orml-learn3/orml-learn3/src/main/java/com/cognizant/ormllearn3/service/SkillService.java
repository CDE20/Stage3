package com.cognizant.ormllearn3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormllearn3.model.Skill;
import com.cognizant.ormllearn3.repository.SkillRepository;

@Service
public class SkillService {
	@Autowired
	private SkillRepository skillRepository;
	public Skill getSkillById(int id) {
		return skillRepository.findById(id);
	}


}