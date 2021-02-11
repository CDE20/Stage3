package com.cognizant.truyum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

	@Query("select m from MenuItem m where m.active=1 and m.dateOfLaunch<='2021-02-11'")
	List<MenuItem> getMenuItemListCustomer();
}
