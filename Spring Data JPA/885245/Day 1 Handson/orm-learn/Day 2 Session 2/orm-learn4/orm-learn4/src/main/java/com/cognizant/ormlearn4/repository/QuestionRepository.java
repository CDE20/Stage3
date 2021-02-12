package com.cognizant.ormlearn4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn4.model.Question;

public interface QuestionRepository extends JpaRepository<Question, String>{

}
