package com.cognizant.ormllearn3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormllearn3.model.Department;
import com.cognizant.ormllearn3.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department getDepartment(int id) {
		return departmentRepository.findById(id);
	}

}
