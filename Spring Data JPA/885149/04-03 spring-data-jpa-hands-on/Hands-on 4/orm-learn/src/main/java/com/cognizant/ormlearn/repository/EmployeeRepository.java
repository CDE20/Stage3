package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.ormlearn.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e left join fetch e.department d left join fetch e.skillList where e.permanent = true")
	List<Employee> getAllPermanentEmployees();
	
	@Query("select AVG(e.salary) from Employee e where e.department.id=:id")
	double getAverageSalary(@Param("id") int id);

}
