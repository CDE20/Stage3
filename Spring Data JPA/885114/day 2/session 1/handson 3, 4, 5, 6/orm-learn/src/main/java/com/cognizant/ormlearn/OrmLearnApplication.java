package com.cognizant.ormlearn;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);

		LOGGER.info("Inside main");

		testGetEmployee();

		testAddEmployee();

		testUpdateEmployee();

		testGetDepartment();

		testAddSkillToEmployee();
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

		Calendar birthDate = Calendar.getInstance();
		birthDate.set(1998, Calendar.JUNE, 3);
		Date dateOfBirth = birthDate.getTime();

		Department department = departmentService.get(1);

		Employee employee = new Employee();
		employee.setId(5);
		employee.setName("Atik");
		employee.setSalary(25000);
		employee.setPermanent(true);
		employee.setDateOfBirth(dateOfBirth);
		employee.setDepartment(department);

		employeeService.save(employee);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.info("End");
	}

	private static void testUpdateEmployee() {
		LOGGER.info("Start");

		Employee employee = employeeService.get(1);
		Department department = departmentService.get(2);
		employee.setDepartment(department);

		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);

		LOGGER.info("End");
	}

	private static void testGetDepartment() {
		LOGGER.info("Start");

		Department department = departmentService.get(1);
		LOGGER.debug("department:{}", department);
		Set<Employee> employeeList = department.getEmployeeList();
		LOGGER.debug("employeeList:{}", employeeList);

		LOGGER.info("End");
	}

	private static void testAddSkillToEmployee() {
		LOGGER.info("Start");

		Employee employee = employeeService.get(1);
		Skill skill = skillService.get(3);
		Set<Skill> skillList = employee.getSkillList();
		skillList.add(skill);
		employeeService.save(employee);

		LOGGER.info("End");
	}

}
