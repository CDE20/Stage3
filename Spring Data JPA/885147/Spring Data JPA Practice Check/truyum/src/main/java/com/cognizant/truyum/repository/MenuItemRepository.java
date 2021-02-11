package com.cognizant.truyum.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.truyum.model.MenuItem;


public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {
	
	List<MenuItem> findByActiveNotAndDateOfLaunchBefore(boolean active,Date dateOfLaunch);

}