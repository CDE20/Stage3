package com.cognizant.ormlearn3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn3.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, String>{

	Department findById(int id);
}
