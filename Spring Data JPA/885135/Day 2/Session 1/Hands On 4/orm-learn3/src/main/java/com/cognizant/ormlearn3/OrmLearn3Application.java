package com.cognizant.ormlearn3;

import java.math.BigDecimal;
import java.sql.Date;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearn3.model.Department;
import com.cognizant.ormlearn3.model.Employee;
import com.cognizant.ormlearn3.service.DepartmentService;
import com.cognizant.ormlearn3.service.EmployeeService;
import com.cognizant.ormlearn3.service.SkillService;

@SpringBootApplication
public class OrmLearn3Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearn3Application.class);
	public static EmployeeService employeeService;
	public static DepartmentService departmentService;
	public static SkillService skillService;
	public static void main(String[] args) {
		SpringApplication.run(OrmLearn3Application.class, args);
		LOGGER.info("Inside main");
		
		ApplicationContext context = SpringApplication.run(OrmLearn3Application.class, args);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		
		//testGetEmployee();
		//testAddEmployee();
		testUpdateEmployee();
		
	}
	
	 private static void testGetEmployee() {

		 LOGGER.info("Start");

		 Employee employee = employeeService.get(1);

		 LOGGER.debug("Employee:{}", employee);

		 LOGGER.debug("Department:{}", employee.getDepartment());

		 LOGGER.info("End");

		 }
	 
	 private static void testAddEmployee() {

		 LOGGER.info("Start");

		 Employee employee = new Employee();
		 employee.setDateOfBirth(Date.valueOf("1998-01-01"));
		 employee.setName("vaishnavi");
		 employee.setPermanent(true);
		 employee.setSalary(new BigDecimal(3000.0));
		 
		 Department d=departmentService.getDepartment(1);
		 
		 employee.setDepartment(d);
		 employeeService.save(employee);
		 

		 LOGGER.debug("Employee:{}", employee);

		 LOGGER.debug("Department:{}", employee.getDepartment());

		 LOGGER.info("End");

		 }
	 
	 public static void  testUpdateEmployee() {
		 
		 Employee employee= employeeService.get(2);
		 Department department= departmentService.getDepartment(3);
		 employee.setDepartment(department);
		 employeeService.save(employee);
		 
	 }

}
