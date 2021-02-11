package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {

	private static StockRepository stockRepository;
	private static EmployeeService employeeService;
	private static SkillService skillService;
	private static DepartmentService departmentService;

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) throws ParseException {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		stockRepository = context.getBean(StockRepository.class);
		LOGGER.info("Inside main stock");
		//stockRepository.findAll();
		//testFindByDate();
		//testFindPriceGreaterThan();
		//testTopThreeHighestDetails();
		//testTop3LowestTransactions();
		//LOGGER.info("Inside main employee");
		employeeService = context.getBean(EmployeeService.class);
		//Employee employee = employeeService.get(2);
		//LOGGER.debug("Employee:{}", employee);

		//LOGGER.info("Inside main department");
		//departmentService = context.getBean(DepartmentService.class);
		//LOGGER.info("Inside main skill");
		//skillService = context.getBean(SkillService.class);
        
		testGetAllPermanentEmployees();
		testGetAverageSalary();
		testGetAllEmployeesNative();
		//testGetEmployee();
		//testAddEmployee();
		//testUpdateEmployee();
		//testGetDepartment();
		//testAddSkillToEmployee();
		
	}
	
	public static void testGetAllPermanentEmployees() {
		LOGGER.info("Start");
		List<Employee> employees = employeeService.getAllPermanentEmployees();
		LOGGER.debug("Permanent Employees:{}", employees);
		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
		LOGGER.info("End");
	}
	
	public static void testGetAverageSalary() {
		LOGGER.info("Start");
		double avgSal = employeeService.getAverageSalary(1);
		System.out.println("Avg Employee salary: "+ avgSal);
		LOGGER.info("End");
	}

	public static void testGetAllEmployeesNative() {
		LOGGER.info("Start");
		List<Employee> emp= employeeService.getAllEmployeesNative();
		LOGGER.debug("Employees:{}", emp);
		LOGGER.info("End");
	}
	
	private static void testFindByDate() throws ParseException {
		List<Stock> result = stockRepository.findAllByCodeAndDateBetween("FB",
				new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-01"),
				new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-30"));
	}

	private static void testFindPriceGreaterThan() {
		stockRepository.findAllByCodeAndCloseGreaterThan("GOOGLE", new BigDecimal(1250.00));
	}

	private static void testTopThreeHighestDetails() {
		stockRepository.findTop3ByOrderByVolumeDesc();
	}

	private static void testTop3LowestTransactions() {
		stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");
	}

	private static void testGetEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(2);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.debug("Skills:{}", employee.getSkillList());
		LOGGER.info("End");
	}

	private static void testAddEmployee() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("omru");
		employee.setSalary(new BigDecimal(16000.00));
		employee.setPermanent(true);
		employee.setDateOfBirth(new Date());
		employee.setDepartment(departmentService.get(1));

		employeeService.save(employee);
	}

	private static void testUpdateEmployee() {
		Employee employee = employeeService.get(2);
		Department department = departmentService.get(2);
		employee.setDepartment(department);
		employeeService.save(employee);
	}

	private static void testGetDepartment() {
		Department department = departmentService.get(1);
		Set<Employee> set = department.getEmployeeList();
		LOGGER.debug("Department:{}", department);
		System.out.println("Employee: " + set.toString());

	}

	private static void testAddSkillToEmployee() {
		Employee employee = employeeService.get(2);
		Skill skill = skillService.get(2);
		Set<Skill> skillList = employee.getSkillList();
		skillList.add(skill);
		employeeService.save(employee);
	}

}
