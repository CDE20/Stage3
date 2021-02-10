package com.cognizant.ormlearn3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn3.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, String>{

}
