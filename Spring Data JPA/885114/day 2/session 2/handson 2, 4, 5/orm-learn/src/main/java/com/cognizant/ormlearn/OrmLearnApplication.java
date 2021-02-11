package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);

		LOGGER.info("Inside main");

		testGetAllPermanentEmployees();
		
		testGetAverageSalary();
		
		testGetAllEmployeesNative();

	}

	private static void testGetAllPermanentEmployees() {
		LOGGER.info("Start");
		
		List<Employee> permanentEmployees = employeeService.getAllPermanentEmployees();
		LOGGER.debug("Permanent Employees:{}", permanentEmployees);
		permanentEmployees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
		
		LOGGER.info("End");
	}

	private static void testGetAverageSalary() {
		LOGGER.info("Start");

		int departmentId = 2;
		double averageSalary = employeeService.getAverageSalary(departmentId);
		LOGGER.debug("Average Salary:{}", averageSalary);

		LOGGER.info("End");
	}

	private static void testGetAllEmployeesNative() {
		LOGGER.info("Start");

		List<Employee> employees = employeeService.getAllEmployeesNative();
		LOGGER.debug("Employees:{}", employees);

		LOGGER.info("End");
	}	

}
