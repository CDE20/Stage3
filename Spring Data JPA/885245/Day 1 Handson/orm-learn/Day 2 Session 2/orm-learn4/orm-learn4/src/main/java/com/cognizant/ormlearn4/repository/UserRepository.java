package com.cognizant.ormlearn4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn4.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}
