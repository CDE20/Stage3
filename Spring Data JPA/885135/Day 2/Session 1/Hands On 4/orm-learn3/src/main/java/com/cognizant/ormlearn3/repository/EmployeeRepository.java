package com.cognizant.ormlearn3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn3.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

	Employee findById(int id);
}
