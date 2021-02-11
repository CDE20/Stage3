package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
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

	@Autowired
	private static StockRepository stockRepository;

	public static void main(String[] args) {
		// SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		stockRepository = context.getBean(StockRepository.class);

		employeeService = context.getBean(EmployeeService.class);

		departmentService = context.getBean(DepartmentService.class);

		skillService = context.getBean(SkillService.class);

		testGetAllCountries();
		try {
			getAllCountriesTest();
			testAddCountry();
			testUpdateCountry();
		} catch (CountryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		testDeleteCountry();

		searchCountry();

		searchCountryStartingWith();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = null, endDate = null;
		try {
			startDate = sdf.parse("2019-09-01");
			endDate = sdf.parse("2019-09-30");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		findByCodeAndDateBetween("FB", startDate, endDate);

		findByCodeAndCloseGreaterThan();

		findTop3HighestVolumes();

		findTop3LowestStockValueForNetflix();

		testGetEmployee();

		testAddEmployee();

		testUpdateEmployee();

		testGetDepartment();

		testAddSkillToEmployee();
	}

	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

	}

	private static void getAllCountriesTest() throws CountryNotFoundException {

		LOGGER.info("Start");

		Country country = countryService.findCountryByCode("IN");

		LOGGER.debug("Country:{}", country);

		LOGGER.info("End");

	}

	private static void testAddCountry() throws CountryNotFoundException {

		LOGGER.info("Start");
		Country demoCountry = new Country();
		demoCountry.setCode("ZZ");
		demoCountry.setName("DEMO");
		countryService.addCountry(demoCountry);
		Country country = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");

	}

	private static void testUpdateCountry() throws CountryNotFoundException {

		LOGGER.info("Start");
		countryService.updateCountry("ZZ", "ZIMWAMBE");
		Country country = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");

	}

	private static void testDeleteCountry() {

		LOGGER.info("Start");
		countryService.deleteCountry("ZZ");
		LOGGER.info("End");

	}

	private static void searchCountry() {

		LOGGER.info("Starting Search Country having 'ou'");
		List<Country> countries = countryService.findCountry("ou");
		LOGGER.debug("Country:{}", countries);
		LOGGER.info("End");

	}

	private static void searchCountryStartingWith() {

		LOGGER.info("Starting Search Country starting with 'Z'");
		List<Country> countries = countryService.findCountryNameStartingWith("Z");
		LOGGER.debug("Country:{}", countries);
		LOGGER.info("End");

	}

	@Transactional
	private static void findByCodeAndDateBetween(String media, Date start, Date end) {

		LOGGER.info("Starting Search for Stocks");

		List<Stock> stocks = stockRepository.findByCodeAndDateBetween(media, start, end);
		LOGGER.debug("Stocks:{}", stocks);
		LOGGER.info("END");

	}

	@Transactional
	private static void findByCodeAndCloseGreaterThan() {

		LOGGER.info("Starting Search for Stocks");

		List<Stock> stocks = stockRepository.findByCodeAndCloseGreaterThan("GOOGL", new BigDecimal(1250));
		LOGGER.debug("Stocks:{}", stocks);
		LOGGER.info("END");

	}

	@Transactional
	private static void findTop3HighestVolumes() {

		LOGGER.info("Starting Search for Stocks");

		List<Stock> stocks = stockRepository.findTop3ByOrderByVolumeDesc();
		LOGGER.debug("Stocks:{}", stocks);
		LOGGER.info("END");

	}

	@Transactional
	private static void findTop3LowestStockValueForNetflix() {

		LOGGER.info("Starting Search for Stocks");

		List<Stock> stocks = stockRepository.findTop3ByCodeOrderByClose("NFLX");
		LOGGER.debug("Stocks:{}", stocks);
		LOGGER.info("END");

	}

	private static void testGetEmployee() {

		LOGGER.info("Start");
		Employee employee = employeeService.get(101);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.debug("Skills:{}", employee.getSkillList());
		LOGGER.info("End");
	}

	private static void testAddEmployee() {

		LOGGER.info("Start");
		Employee employee = new Employee();
		employee.setId(105);
		employee.setName("Shubham Kumar");
		employee.setPermanent(true);
		employee.setSalary(new BigDecimal(25000));
		employee.setDateOfBirth(new Date());
		Department department = new Department();
		department.setId(1);
		department.setName("CDE");
		employee.setDepartment(department);

		employeeService.save(employee);

		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");
	}

	private static void testUpdateEmployee() {

		LOGGER.info("Start");
		Employee employee = employeeService.get(105);
		employee.setPermanent(false);
		Department department = departmentService.get(3);
		employee.setDepartment(department);
		employeeService.save(employee);

		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");
	}

	private static void testGetDepartment() {

		LOGGER.info("Start");
		Department department = departmentService.get(3);
		LOGGER.debug("Department:{}", department);
		LOGGER.debug("Employees:{}", department.getEmployeeList());
		LOGGER.info("End");
	}

	private static void testAddSkillToEmployee() {

		LOGGER.info("Start");
		Employee employee = employeeService.get(105);
		Skill skill = skillService.get(12);
		employee.getSkillList().add(skill);
		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.debug("Skills:{}", employee.getSkillList());
		LOGGER.info("End");
	}

}
