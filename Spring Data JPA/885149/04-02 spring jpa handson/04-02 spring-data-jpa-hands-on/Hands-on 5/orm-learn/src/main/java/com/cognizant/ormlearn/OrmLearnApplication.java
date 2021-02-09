package com.cognizant.ormlearn;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;

	public static void main(String[] args) {
		// SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);

//		testGetAllCountries();
//
//		testGetCountriesByCode();
//
//		testAddCountry();
//
//		testUpdateCountry();
//		
//		//testDeleteCountry();
//		
//		testfindbyName();
		
//		
//		testGetEmployee();
//		
//		testAddEmployee();
//		
//		testUpdateEmployee();
		
		testGetDepartment();
	}

	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> country = countryService.getAllCountries();

		LOGGER.debug("Country={}", country);

		LOGGER.info("End");
	}

	private static void testGetCountriesByCode() {

		LOGGER.info("Start");

		Country country = null;
		try {
			country = countryService.findCountryByCode("IN");
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
		}

		LOGGER.debug("Country={}", country);

		LOGGER.info("End");
	}

	private static void testAddCountry() {
		Country temp = new Country();
		temp.setCode("am");
		temp.setName("America");
		LOGGER.info("Start");
		countryService.addCountry(temp);
		Country country = null;
		try {
			country = countryService.findCountryByCode("am");
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured");
		}
		LOGGER.debug("Country={}", country);

		LOGGER.info("Stop");
	}

	private static void testUpdateCountry() {
		LOGGER.info("Start test 8");
		countryService.updateCountry("mg", "Madagascar");
		LOGGER.info("Stop Test 8");
	}
	
	private static void testDeleteCountry() {
		LOGGER.info("Start test 9");
		countryService.deleteCountry("ag");
		LOGGER.info("Stop test 9");

	}
	
	private static void testfindbyName() {
		LOGGER.info("Start test 9");
		List<Country> c = countryService.findCourtryContainingLetters("United");
		LOGGER.debug("Country={}",c);
		LOGGER.info("Stop test 9");

	}
	
	private static void testGetEmployee() {
		LOGGER.info("Start test 10");
		Employee employee = employeeService.get(101);
		LOGGER.debug("Employee={}",employee);
		LOGGER.info("End test 10");
	}
	
	private static void testAddEmployee() {
		LOGGER.info("Start test 11");
		Employee employee = new Employee();
		employee.setId(6);
		employee.setName("Mohit");
		employee.setPermanent(true);
		employee.setSalary(50000.00);
		employee.setDateOfBirth(new Date());
		employee.setDepartment(departmentService.get(1));
		employeeService.save(employee);
		LOGGER.debug("Employee={}",employee);
		LOGGER.info("End test 10");
	}
	private static void testUpdateEmployee() {
		LOGGER.info("Start test 12");
		Employee employee = employeeService.get(105);
		employee.setDepartment(departmentService.get(2));
		employeeService.save(employee);
		LOGGER.debug("Employee={}",employee);
		LOGGER.info("End test 10");
	}
	
	private static void testGetDepartment() {
		LOGGER.info("Start test 12");
		Department department = departmentService.get(1);
		LOGGER.debug("Employee={}",department.getEmployeeList());
		LOGGER.info("Stop test 13");
	}

}
