package com.cognizant.ormllearn3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormllearn3.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, String> {
	Skill findById(int id);


}
