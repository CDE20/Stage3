package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.util.Date;
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
public class OrmLearnPayrollApplication {

	@Autowired
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnPayrollApplication.class);
	public static void main(String[] args) {
		//SpringApplication.run(OrmLearnPayrollApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(OrmLearnPayrollApplication.class, args);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		LOGGER.info("Inside main");
		//testGetEmployee();
		//testAddEmployee();
		//testUpdateEmployee();
		 //testGetDepartment();
		testAddSkillToEmployee();
	}
	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(101);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		LOGGER.info("End");

		}
	
	private static void testAddEmployee() {
       LOGGER.info("Start");
		
		Employee employee = new Employee();
		employee.setId(105);
		employee.setName("priya");
		employee.setSalary(new BigDecimal("25000.00"));
		employee.setPermanent(true);
		employee.setDateOfBirth(new Date());
		
		Department department = departmentService.get(1);
		employee.setDepartment(department);
		employeeService.save(employee);
		LOGGER.info("End");
	}
	
	private static void testUpdateEmployee() {
		LOGGER.info("start");
		Employee employee= employeeService.get(105);
		employee.setName("Pri");
		Department department = departmentService.get(2);
		employee.setDepartment(department);
		
		employeeService.save(employee);
		LOGGER.info("end");
	}
	
	private static void testGetDepartment() {
		LOGGER.info("start");
		Department department=departmentService.get(2);
		Set<Employee> list = department.getEmployeeList();
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
		LOGGER.info("end");
	}
	
	private static void testAddSkillToEmployee() {
		LOGGER.info("start");
		Employee employee = employeeService.get(101);
		Skill skill = skillService.get(13);
		employee.getSkillList().add(skill);
		employeeService.save(employee);
		
		LOGGER.info("End");
		
	}
}
