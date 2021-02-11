package com.cognizant.truyum;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

@SpringBootApplication
public class TruyumApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(TruyumApplication.class);

	public static MenuItemService menuItemService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TruyumApplication.class, args);
		menuItemService = context.getBean(MenuItemService.class);
		
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
	}

	public static void testGetMenuItemListCustomer() {

		LOGGER.info("Start");
		List<MenuItem> items = menuItemService.getMenuItemListCustomer();
		LOGGER.debug("Active Menu Items:{}", items);
		LOGGER.info("End");

	}
	
	public static void testGetMenuItemListAdmin() {

		LOGGER.info("Start");
		List<MenuItem> items = menuItemService.getMenuItemListAdmin();
		LOGGER.debug("Admin Menu Items:{}", items);
		LOGGER.info("End");

	}
}
