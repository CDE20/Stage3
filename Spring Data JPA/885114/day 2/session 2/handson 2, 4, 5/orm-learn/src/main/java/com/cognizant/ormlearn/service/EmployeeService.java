package com.cognizant.ormlearn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	public Employee get(int id) {
		LOGGER.info("Start");

		Employee employee = employeeRepository.findById(id).get();

		LOGGER.info("End");
		return employee;
	}

	@Transactional
	public void save(Employee employee) {
		LOGGER.info("Start");

		employeeRepository.save(employee);

		LOGGER.info("End");
	}
	
	@Transactional
	public List<Employee> getAllPermanentEmployees() {
		LOGGER.info("Start");

		List<Employee> list = employeeRepository.getAllPermanentEmployees();

		LOGGER.info("End");
		return list;
	}
	
	@Transactional
	public double getAverageSalary(int departmentId) {
		LOGGER.info("Start");

		double averageSalary = employeeRepository.getAverageSalary(departmentId);
		
		LOGGER.info("End");
		return averageSalary;
	}
	
	@Transactional
	public List<Employee> getAllEmployeesNative() {
		LOGGER.info("Start");

		List<Employee> employees = employeeRepository.getAllEmployeesNative();
		
		LOGGER.info("End");
		return employees;
	}
}
