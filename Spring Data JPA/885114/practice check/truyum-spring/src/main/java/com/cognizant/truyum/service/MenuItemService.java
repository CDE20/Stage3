package com.cognizant.truyum.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepository;

@Service
public class MenuItemService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemService.class);

	@Autowired
	private MenuItemRepository menuItemRepository;

	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		LOGGER.info("Start");
		List<MenuItem> list = menuItemRepository.findAll();
		LOGGER.info("End");
		
		return list;
	}

	public Set<MenuItem> getMenuItemListCustomer() {
		LOGGER.info("Start");
		Set<MenuItem> set = menuItemRepository.findByActiveAndDateOfLaunchBefore(true, new Date());
		LOGGER.info("End");

		return set;
	}

	public MenuItem getMenuItem(long id) {
		LOGGER.info("Start");
		MenuItem menuItem = menuItemRepository.findById(id).get();
		LOGGER.info("End");
		return menuItem;
	}

	public void modifyMenuItem(MenuItem menuItem) {
		LOGGER.info("Start");
		MenuItem menuItemNew = menuItemRepository.getOne(menuItem.getId());
		menuItemNew = menuItem;
		menuItemRepository.save(menuItemNew);
		LOGGER.info("End");
	}


}
