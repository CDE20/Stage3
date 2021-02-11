package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	@Autowired
	private static EmployeeService empService;
	@Autowired
	private static SkillService skillService;
	@Autowired
	private static DepartmentService dpService;
	
	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(OrmLearnApplication.class, args);
		
		 empService = Context.getBean(EmployeeService.class);
		 skillService = Context.getBean(SkillService.class);
		 dpService = Context.getBean(DepartmentService.class);
		 
		 //testAddEmployee();
		 //testUpdateEmployee();
		 //testGetEmployee();
		 //testGetDepartment();
		 //testAddSkillToEmployee();
		 testGetAllPermanentEmployees();
	
}
	
	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = empService.get(102);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());
		
		LOGGER.debug("Skill:{}",employee.getSkillList());

		LOGGER.info("End");

		}
	
	private static void testAddEmployee() {
		LOGGER.info("Start");
		
		Employee employee = new Employee();
		employee.setId(105);
		employee.setName("Nakul");
		employee.setSalary(new BigDecimal("25825.00"));
		employee.setPermanent(true);
		employee.setDateOfBirth(new Date());
		
		Department department = dpService.get(1);
		employee.setDepartment(department);
		empService.save(employee);
		LOGGER.info("End");
	}
	
	private static void testUpdateEmployee() {
		LOGGER.info("start");
		Employee employee = empService.get(102);
		employee.setName("Priya");
		Department department = dpService.get(2);
		employee.setDepartment(department);
		
		empService.save(employee);
		LOGGER.info("end");
		
	}
	
	private static void testGetDepartment() {
		
		LOGGER.info("start");
		Department department = dpService.get(1);
		Set<Employee> list = department.getEmployeeList();
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
		LOGGER.info("End");
		
	}
	
	private static void testAddSkillToEmployee() {
		LOGGER.info("start");
		Employee employee = empService.get(101);
		Skill skill = skillService.get(13);
		employee.getSkillList().add(skill);
		empService.save(employee);
		
		LOGGER.info("End");
		
	}
	
	public static void testGetAllPermanentEmployees() {

		LOGGER.info("Start");

		List<Employee> employees = empService.getAllPermanentEmployee();

		LOGGER.debug("Permanent Employees:{}", employees);

		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));

		LOGGER.info("End");

		}
}
