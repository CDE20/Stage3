package com.cognizant.ormlearn3;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearn3.model.Department;
import com.cognizant.ormlearn3.model.Employee;
import com.cognizant.ormlearn3.model.Skill;
import com.cognizant.ormlearn3.repository.EmployeeRepository;
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
		//testUpdateEmployee();
		//testGetDepartment();
		//testAddSkillToEmployee();
		//testGetAllPermanentEmployees();
		//testGetAverageSalary();
		testgetAllEmployeesNative();
	}
	
	 private static void testGetEmployee() {

		 LOGGER.info("Start");

		 Employee employee = employeeService.get(1);

		 LOGGER.debug("Employee:{}", employee);

		 LOGGER.debug("Department:{}", employee.getDepartment());
		 
		 LOGGER.debug("Skills:{}", employee.getSkillList()); 

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
	 
	 public static void  testGetDepartment() {
		 
		 Department department=departmentService.getDepartment(3);
		 LOGGER.debug("Department:{}",department);
		 LOGGER.debug("Employee:{}",department.getEmployeeList());
	 }
	 
	 public static void  testAddSkillToEmployee() {
		 Employee employee=employeeService.get(4);
		 Skill skill=skillService.getSkillById(1);
		 employee.getSkillList().add(skill);
		 employeeService.save(employee);
	 }
	 
	 public static void testGetAllPermanentEmployees() {
		 List<Employee> list=employeeService.getAllPermanentEmployees();
		 LOGGER.debug("Employee{}", employeeService);
		 list.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
		 LOGGER.info("End");
	 }
	 
	 public static void testGetAverageSalary() {
		 LOGGER.debug("avg:{}",employeeService.getAverageSalary(3));
	 }
	 
	 public static void testgetAllEmployeesNative() {
		 LOGGER.debug("Employees:{}",employeeService.getAllEmployeesNative());
	 }

}
