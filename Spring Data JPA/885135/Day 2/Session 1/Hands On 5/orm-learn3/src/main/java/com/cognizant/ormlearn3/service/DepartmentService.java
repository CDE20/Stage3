package com.cognizant.ormlearn3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn3.model.Department;
import com.cognizant.ormlearn3.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository deparmentRepository;
	
	public Department getDepartment(int id) {
		return deparmentRepository.findById(id);
	}
}
