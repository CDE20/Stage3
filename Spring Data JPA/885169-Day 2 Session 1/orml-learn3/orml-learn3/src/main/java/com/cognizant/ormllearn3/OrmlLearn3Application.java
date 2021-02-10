package com.cognizant.ormllearn3;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormllearn3.model.Department;
import com.cognizant.ormllearn3.model.Employee;
import com.cognizant.ormllearn3.model.Skill;
import com.cognizant.ormllearn3.service.DepartmentService;
import com.cognizant.ormllearn3.service.EmployeeService;
import com.cognizant.ormllearn3.service.SkillService;



@SpringBootApplication
public class OrmlLearn3Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmlLearn3Application.class);
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;


	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(OrmlLearn3Application.class, args);
				employeeService = context.getBean(EmployeeService.class);
				departmentService = context.getBean(DepartmentService.class);
				skillService=context.getBean(SkillService.class);
				testGetEmployee();
				//testAddEmployee();
				//testUpdateEmployee();
				//testGetDepartment();
				//testAddSkillToEmployee();
				//testGetAllPermanentEmployees();
				//testGetAvgSalary();
				//testGetAllEmployeesNative();
		       LOGGER.info("Inside main");
	}
	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(1);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.debug("Skills:{}", employee.getSkillList());
		LOGGER.info("End");

		}
	public static void testAddEmployee()
	{
		Employee e = new Employee();
		e.setName("priya");
		e.setSalary(new BigDecimal(25000));
		e.setDate(Date.valueOf("1999-08-12"));
		e.setPermanent(true);
		Department d=departmentService.getDepartment(1);
		e.setDepartment(d);
		employeeService.save(e);
		 LOGGER.debug("Employee:{}", e);
		 LOGGER.debug("Department:{}", e.getDepartment());
		 LOGGER.info("End");

	}
	public static void testUpdateEmployee()
	{
		Employee e1=employeeService.get(4);
		 Department department= departmentService.getDepartment(2);
		 e1.setDepartment(department);
		 employeeService.save(e1);
	}
	public static void testGetDepartment()
	{
		Department d1=departmentService.getDepartment(1);
		 LOGGER.debug("Department:{}",d1);
		 LOGGER.debug("Employee:{}",d1.getEmployeeList());

	}
	public static void testAddSkillToEmployee()
	{
		Employee employee=employeeService.get(4);
		Skill skill=skillService.getSkillById(1);
		employee.getSkillList().add(skill);
		employeeService.save(employee);
		LOGGER.debug("Employee:{}",employee.getSkillList());

		
	}
	public static void testGetAllPermanentEmployees() {

		LOGGER.info("Start");

		List<Employee> employees = employeeService.getAllPermanentEmployees();

		LOGGER.debug("Permanent Employees:{}", employees);

		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));

		LOGGER.info("End");

		}
	public static void testGetAvgSalary()
	{
		employeeService.getAvgSalary(1);
	}
	public static void testGetAllEmployeesNative()
	{
		employeeService.getAllEmployeesNative();
	}

}
