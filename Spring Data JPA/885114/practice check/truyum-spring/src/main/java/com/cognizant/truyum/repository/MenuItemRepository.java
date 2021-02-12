package com.cognizant.truyum.repository;

import java.util.Date;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

	Set<MenuItem> findByActiveAndDateOfLaunchBefore(boolean active, Date date);

}
