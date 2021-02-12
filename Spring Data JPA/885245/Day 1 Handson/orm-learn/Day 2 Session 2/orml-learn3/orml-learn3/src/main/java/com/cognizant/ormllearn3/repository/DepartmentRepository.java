package com.cognizant.ormllearn3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormllearn3.model.Department;



public interface DepartmentRepository extends JpaRepository<Department, String>{
	Department findById(int id);

}
