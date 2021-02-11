package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}