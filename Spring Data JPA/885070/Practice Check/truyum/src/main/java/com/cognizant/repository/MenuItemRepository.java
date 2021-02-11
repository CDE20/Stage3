package com.cognizant.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
	
	List<MenuItem> findByActiveAndDateOfLaunchBefore(String active, Date date);

}